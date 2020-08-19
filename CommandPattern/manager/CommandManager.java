package CommandPattern.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import CommandPattern.commands.C1;
import CommandPattern.commands.C2;
import CommandPattern.commands.Command;
import CommandPattern.qstack.QStack;

public class CommandManager {

    private static CommandManager instance=null;

    private QStack<List<Command>> queueStackNormal;

    private QStack<List<Command>> queueStackReverse;

    private List<String> actionHistory;

    static CommandManager getInstance(){

        if(instance!=null)
            return instance;

        synchronized (CommandManager.class){
            if(instance==null) {
                instance = new CommandManager();
            }
        }

        return instance;
    }

    private CommandManager(){
        queueStackNormal=new QStack<>();
        queueStackReverse=new QStack<>();
        actionHistory=new ArrayList<>();
    }

    void execute(List<Command> commandList){

        commandList.forEach(Command::execute);
        queueStackNormal.push(commandList);
        commandList.forEach(command -> actionHistory.add(command.getName()));

    }

    void undo(){
        Optional<List<Command>> optionalCommandList=queueStackNormal.pop();

        optionalCommandList.ifPresent(

                commandList->{
                    commandList.forEach(Command::execute);
                    queueStackReverse.push(commandList);
                    commandList.forEach(command -> actionHistory.add(command.getName()+" - undo"));

                }
        );
    }

    void redo(){
        Optional<List<Command>> optionalCommandList=queueStackReverse.pop();

        optionalCommandList.ifPresent(
                commandList -> {
                    commandList.forEach(Command::execute);
                    queueStackNormal.push(commandList);
                    commandList.forEach(command -> actionHistory.add(command.getName()+" - redo"));
                }
        );
    }

    void clearNormal(){
        queueStackNormal.clear();
    }

    void clearReverse(){
        queueStackReverse.clear();
    }

    List<String> getActionHistory(){
        return Collections.unmodifiableList(actionHistory);
    }

    public static void main(String[] args) {

        CommandManager commandManager=CommandManager.getInstance();
        List<Command> commandList=new ArrayList<>();
        commandList.add(new C1("Command-1"));
        commandList.add(new C2("Command-2"));
        System.out.println("===ACTIONS===");
        commandManager.execute(commandList);
        commandManager.undo();
        commandManager.redo();
        commandManager.clearNormal();
        commandManager.undo();
        commandManager.redo();
        System.out.println("===HISTORY===");

        System.out.println(commandManager.getActionHistory().toString());

    }
}

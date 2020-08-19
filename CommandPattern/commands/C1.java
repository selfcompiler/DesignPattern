package CommandPattern.commands;

public class C1 implements Command {

    private String name;

    public C1(String name){
        this.name=name;
    }

    @Override
    public void execute() {
        System.out.printf("Execute : "+name);
    }

    @Override
    public void undo() {
        System.out.printf("Undo :"+name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}

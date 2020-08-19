package CommandPattern.commands;

public interface Command {

    void execute();

    void undo();

    String getName();
}

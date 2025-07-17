package BehaviouralPatterns.CommandPattern;

public class TurnOnCommand implements Command{
    TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("Turnned on the current tv : " + this.tv.getName());
    }
}

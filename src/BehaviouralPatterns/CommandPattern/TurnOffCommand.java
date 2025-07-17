package BehaviouralPatterns.CommandPattern;

public class TurnOffCommand implements Command{
    TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("Turnned off the current tv : " + this.tv.getName());
    }
}

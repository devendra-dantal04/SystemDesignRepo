package BehaviouralPatterns.CommandPattern;

public class TV {

    private Command turnOnCommand;
    private Command turnOffCommand;
    private String tvName;

    public void turnOnTv() {
        this.turnOnCommand.execute();
    }

    public void turnOffTv() {
        this.turnOffCommand.execute();
    }

    public void setTurnOnCommand(Command turnOn) {
        this.turnOnCommand = turnOn;
    }

    public void setTurnOffCommand(Command turnOff) {
        this.turnOffCommand = turnOff;
    }

    public void setName(String name) {
        this.tvName = name;
    }

    public String getName() {
        return this.tvName;
    }
}

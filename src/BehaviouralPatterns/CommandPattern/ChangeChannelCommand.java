package BehaviouralPatterns.CommandPattern;

public class ChangeChannelCommand implements Command{

    private String channel;
    private TV tv;

    public ChangeChannelCommand(TV tv, String channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        System.out.println("Channel has been chnage to " + this.channel);
    }
}

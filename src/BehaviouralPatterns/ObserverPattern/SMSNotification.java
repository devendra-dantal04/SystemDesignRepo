package BehaviouralPatterns.ObserverPattern;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send(String username, String channelName, String videoTitle) {
        System.out.println("SMS || New Upload on " + channelName + " of : " + videoTitle + " | " + username);
    }
}

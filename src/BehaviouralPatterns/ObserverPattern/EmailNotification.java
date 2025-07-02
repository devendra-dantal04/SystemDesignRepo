package BehaviouralPatterns.ObserverPattern;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void send(String username, String channelName, String videoTitle) {
        System.out.println("EMAIL || New Upload on " + channelName + " of : " + videoTitle + " | " + username);
    }
}

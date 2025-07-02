package BehaviouralPatterns.ObserverPattern;

public class User implements Subscriber {
    String username;
    NotificationStrategy notificationStrategy;

    public User(String username, NotificationStrategy notificationStrategy) {
        this.username = username;
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        this.notificationStrategy.send(username, channelName, videoTitle);
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
}

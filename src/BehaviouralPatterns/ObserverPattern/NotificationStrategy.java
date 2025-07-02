package BehaviouralPatterns.ObserverPattern;

public interface NotificationStrategy {
    void send(String username, String channelName, String videoTitle);
}

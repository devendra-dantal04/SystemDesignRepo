package BehaviouralPatterns.ObserverPattern;

public interface Subscriber {
    void update(String channelName, String videoTitle);
}

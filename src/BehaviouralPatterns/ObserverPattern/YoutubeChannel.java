package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;

public class YoutubeChannel implements Channel{
    String channelName;
    ArrayList<Subscriber> subscribers = new ArrayList<>();

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for(Subscriber sub : subscribers) {
            sub.update(this.channelName, videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("The video " + videoTitle + " has been uploaded on channel " + this.channelName);
        notifySubscribers(videoTitle);
    }
}

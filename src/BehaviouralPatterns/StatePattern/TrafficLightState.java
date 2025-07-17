package BehaviouralPatterns.StatePattern;

public interface TrafficLightState {
    public void next(TrafficLightContext context);
    public String getCurrentState();
}

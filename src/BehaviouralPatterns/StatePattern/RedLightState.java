package BehaviouralPatterns.StatePattern;

public class RedLightState implements TrafficLightState{
    String stateName = "RED";

    @Override
    public void next(TrafficLightContext context) {
        context.setState(new GreenState());
    }

    @Override
    public String getCurrentState() {
        return this.stateName;
    }
}

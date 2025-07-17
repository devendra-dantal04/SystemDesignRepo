package BehaviouralPatterns.StatePattern;

public class GreenState implements TrafficLightState{
    String stateName = "GREEN";

    @Override
    public void next(TrafficLightContext context) {
        context.setState(new RedLightState());
    }

    @Override
    public String getCurrentState() {
        return this.stateName;
    }
}

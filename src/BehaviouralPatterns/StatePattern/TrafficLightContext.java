package BehaviouralPatterns.StatePattern;

public class TrafficLightContext {
    TrafficLightState currentState;

    public TrafficLightContext(TrafficLightState state) {
        this.currentState = state;
    }

    public void next() {
        System.out.println("PREV STATE : " + this.currentState.getCurrentState());
        this.currentState.next(this);
        System.out.println("UPDATED STATE : " + this.currentState.getCurrentState());
    }

    public String getCurrentState() {
        return this.currentState.getCurrentState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }


}

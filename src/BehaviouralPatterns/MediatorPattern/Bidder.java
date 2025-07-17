package BehaviouralPatterns.MediatorPattern;

public class Bidder {
    String name;

    public Bidder(String name) {
        this.name = name;
    }

    public void notifyBid(Bid bid) {
        System.out.println("Notifying to " + this.name + " the bid has been placed by " + bid.bidder.name + " of the amount " + bid.amount);
    }
}

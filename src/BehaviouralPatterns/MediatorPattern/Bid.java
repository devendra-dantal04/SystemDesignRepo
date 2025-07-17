package BehaviouralPatterns.MediatorPattern;

public class Bid {
    int amount;
    Bidder bidder;

    public Bid(Bidder bidder, int amount) {
        this.bidder = bidder;
        this.amount = amount;
    }
}

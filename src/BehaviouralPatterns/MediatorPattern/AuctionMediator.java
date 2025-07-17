package BehaviouralPatterns.MediatorPattern;

public interface AuctionMediator {
    public void registerBidder(Bidder bidder);
    public void placeBid(Bid bid);
}

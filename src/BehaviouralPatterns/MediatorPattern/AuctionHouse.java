package BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;

public class AuctionHouse implements AuctionMediator{
    ArrayList<Bidder> bidders = new ArrayList<>();

    @Override
    public void registerBidder(Bidder bidder) {
        this.bidders.add(bidder);
    }

    @Override
    public void placeBid(Bid bid) {
        System.out.println("The bidder is placing the bid");

        bidders.forEach((bidder -> {
            if(bidder != bid.bidder) {
                bidder.notifyBid(bid);
            }
        }));
    }
}

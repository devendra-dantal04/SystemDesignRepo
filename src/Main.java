import BehaviouralPatterns.CommandPattern.*;
import BehaviouralPatterns.IteratorPattern.FavouriteSongIterator;
import BehaviouralPatterns.IteratorPattern.Playlist;
import BehaviouralPatterns.IteratorPattern.PlaylistIterator;
import BehaviouralPatterns.MediatorPattern.AuctionHouse;
import BehaviouralPatterns.MediatorPattern.AuctionMediator;
import BehaviouralPatterns.MediatorPattern.Bid;
import BehaviouralPatterns.MediatorPattern.Bidder;
import BehaviouralPatterns.ObserverPattern.*;
import BehaviouralPatterns.StatePattern.GreenState;
import BehaviouralPatterns.StatePattern.RedLightState;
import BehaviouralPatterns.StatePattern.TrafficLightContext;
import BehaviouralPatterns.StatePattern.TrafficLightState;
import BehaviouralPatterns.StratergyPattern.CreditCardStrategy;
import BehaviouralPatterns.StratergyPattern.PaymentGateway;
import BehaviouralPatterns.StratergyPattern.PaymentStratergy;
import BehaviouralPatterns.StratergyPattern.PaypalStrategy;
import CreationalPatterns.PrototypePattern.Address;
import CreationalPatterns.PrototypePattern.Character;
import TemplatePattern.CoffeeBeverage;
import TemplatePattern.TeaBeverage;

class Main {
    public static void main(String[] args) {
//        Builder Pattern
//        BuilderPattern.Car.CarBuilder builder = new BuilderPattern.Car.CarBuilder();
//
//        BuilderPattern.Car newCar = builder.setEngine("V8")
//                .setSeats(10)
//                .setWheels(5)
//                .setSunRoof(true)
//                .build();
//
//        System.out.println(newCar.toString());


//        Singleton Pattern
//        Logger logger = Logger.getLogger();
//        logger.log("Hello World");
//        LoggerDoubleCheck logger = LoggerDoubleCheck.getLogger();
//        logger.log("hello namaste");


//        Prototype Pattern
//        - Help to reuse the code if there are only some minor changes among the objects

//        Address address = new Address("123, Astral");
//        Character ch = new Character("Bob", address);
//        System.out.println(ch.toString());
//
//        try {
//            Character ch2 = (Character) ch.deepCopy(); deep copy
//            Shallow Copy
//            Character ch2 = (Character) ch.clone();
//            ch2.name = "Kobra";
//            ch2.address.street = "122, Prabhavee";
//
//            System.out.println(ch2.toString());
//            System.out.println(ch.toString());
//        }catch (Exception exp) {
//            System.out.println(exp.getMessage());
//        }



//        Behavioural Patterns

//        1. Strategy Pattern

//        PaymentStratergy creditCard = new CreditCardStrategy("credit-card");
//        PaymentStratergy payPal = new PaypalStrategy("pay-pal");
//
//
//        PaymentGateway paymentGateway = new PaymentGateway(creditCard);
//        paymentGateway.makePayment();
//
//        paymentGateway.setPaymentStratergy(payPal);
//        paymentGateway.makePayment();


//        2. Observer Pattern
//        NotificationStrategy emailNotification = new EmailNotification();
//        NotificationStrategy smsNotification = new SMSNotification();
//
//        User user1 = new User("test1", emailNotification);
//        User user2 = new User("test2", smsNotification);
//
//        YoutubeChannel channel = new YoutubeChannel("ytmaska" );
//        channel.subscribe(user1);
//        channel.subscribe(user2);
//
//        channel.uploadVideo("test video");


//        3. Iterator Pattern
//        Playlist playlist = new Playlist();
//        playlist.addSong("Song 1");
//        playlist.addSong("Song 2");
//        playlist.addSong("Song 3 Fav");
//
//        PlaylistIterator iterator = playlist.getIterator("fav");
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());



//        4. Command Pattern
//        TV tv = new TV();
//        tv.setName("Plasma TV");
//
//        Command changeChannelCommand = new ChangeChannelCommand(tv, "PoGo");
//        Command turnOnCommand = new TurnOnCommand(tv);
//        Command turnOffCommand = new TurnOffCommand(tv);
//
//        tv.setTurnOffCommand(turnOffCommand);
//        tv.setTurnOnCommand(turnOnCommand);
//
//        tv.turnOnTv();
//        tv.turnOffTv();
//
//        changeChannelCommand.execute();


//        5. Mediator Pattern
//        Bidder bidder1 = new Bidder("bidder1");
//        Bidder bidder2 = new Bidder("bidder2");
//        Bidder bidder3 = new Bidder("bidder3");
//
//        Bid b1 = new Bid(bidder1, 1000);
//        Bid b2 = new Bid(bidder2, 5000);
//        Bid b3 = new Bid(bidder1, 9000);
//
//        AuctionHouse auctionHouse = new AuctionHouse();
//
//        auctionHouse.registerBidder(bidder1);
//        auctionHouse.registerBidder(bidder2);
//        auctionHouse.registerBidder(bidder3);
//
//        auctionHouse.placeBid(b1);
//        auctionHouse.placeBid(b2);
//        auctionHouse.placeBid(b3);

//        6. State Pattern
//        TrafficLightState redState = new RedLightState();
//
//        TrafficLightContext trafficLight = new TrafficLightContext(redState);
//
//        trafficLight.next();
//        trafficLight.next();

//        7. Template Pattern
//        TeaBeverage teaBeverage = new TeaBeverage();
//        teaBeverage.prepareBeverage();
//
//        CoffeeBeverage coffeeBeverage = new CoffeeBeverage();
//        coffeeBeverage.prepareBeverage();

    }
}
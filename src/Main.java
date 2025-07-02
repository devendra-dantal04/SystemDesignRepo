import BehaviouralPatterns.ObserverPattern.*;
import BehaviouralPatterns.StratergyPattern.CreditCardStrategy;
import BehaviouralPatterns.StratergyPattern.PaymentGateway;
import BehaviouralPatterns.StratergyPattern.PaymentStratergy;
import BehaviouralPatterns.StratergyPattern.PaypalStrategy;
import CreationalPatterns.PrototypePattern.Address;
import CreationalPatterns.PrototypePattern.Character;

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
        NotificationStrategy emailNotification = new EmailNotification();
        NotificationStrategy smsNotification = new SMSNotification();

        User user1 = new User("test1", emailNotification);
        User user2 = new User("test2", smsNotification);

        YoutubeChannel channel = new YoutubeChannel("ytmaska" );
        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("test video");
    }
}
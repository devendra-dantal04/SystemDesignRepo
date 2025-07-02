package BehaviouralPatterns.StratergyPattern;

public class CreditCardStrategy implements PaymentStratergy {
    String methodName;

    public CreditCardStrategy(String name) {
        this.methodName = name;
    }

    @Override
    public void processPayment() {
        System.out.println("The payment has been made using " + this.methodName);
    }
}

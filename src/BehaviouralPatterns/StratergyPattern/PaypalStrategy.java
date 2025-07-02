package BehaviouralPatterns.StratergyPattern;

public class PaypalStrategy implements PaymentStratergy {
    String methodName;

    public PaypalStrategy(String name) {
        this.methodName = name;
    }

    @Override
    public void processPayment() {
        System.out.println("The payment has been made using " + this.methodName);
    }
}

package BehaviouralPatterns.StratergyPattern;

public class PaymentGateway {
    public PaymentStratergy paymentStratergy;

    public PaymentGateway(PaymentStratergy stratergy) {
        this.paymentStratergy = stratergy;
    }

    public void makePayment() {
        this.paymentStratergy.processPayment();
    }

    public void setPaymentStratergy(PaymentStratergy stratergy) {
        this.paymentStratergy = stratergy;
    }
}

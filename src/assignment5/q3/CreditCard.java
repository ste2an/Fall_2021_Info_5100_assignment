package assignment5.q3;

public class CreditCard implements PaymentStrategy{

    private String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int i) {

    }
}

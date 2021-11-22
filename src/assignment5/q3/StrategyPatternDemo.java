package assignment5.q3;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PayPal("my@pay.com"));
        cart.pay(new CreditCard("3456 8790 8712"));
    }
}

package assignment5.q3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list;

    public ShoppingCart() {
        list = new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void removeItem(Item item){
        list.remove(item);
    }

    public int calculateTotal(){
        int price = 0;
        for(Item i : list){
            price += i.getPrice();
        }
        return price;
    }

    public void pay(PaymentStrategy p){
        if(p.getClass() == PayPal.class){
            System.out.println("Paypal : " + calculateTotal());
        }

        if(p.getClass() == CreditCard.class){
            System.out.println("Credit Card : " + calculateTotal());
        }
    }

}

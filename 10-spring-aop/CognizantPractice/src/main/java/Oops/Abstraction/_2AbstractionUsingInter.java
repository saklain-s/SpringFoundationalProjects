package Oops.Abstraction;

interface Payments{
    void pay(int amount); // abstract method
}

class CreditCardPayment implements Payments{
    @Override
    public void pay(int amount){
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment implements Payments{
    @Override
    public void pay(int amount){
        System.out.println("Paid " + amount + " using UPI ");
    }
}

class PayPalPayment implements Payments {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

public class _2AbstractionUsingInter {
    public static void main(String[] args) {

        Payments p1 = new CreditCardPayment();
        Payments p2 = new UPIPayment();
        Payments p3 = new CreditCardPayment();

        p1.pay(1000);
        p2.pay(3223);
        p3.pay(533);

        System.out.println();
        Payments[] p = {new CreditCardPayment(), new UPIPayment(), new PayPalPayment()};

        for (Payments c: p){
            c.pay(500);
        }

    }
}

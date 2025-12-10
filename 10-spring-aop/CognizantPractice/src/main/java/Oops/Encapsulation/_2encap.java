package Oops.Encapsulation;

class BankAccount{
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Deposit must be positive");
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient founds or invalid amount");
    }
}


public class _2encap {
    public static void main(String[] args) {

        BankAccount ba  = new BankAccount();

        ba.deposit(6000);
        ba.withdraw(2000);
        System.out.println("Balance amount is: "+ba.getBalance());
    }
}

package entities;

public class Wallet {

    private double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double n) {
        amount += n;
    }

    public void withdraw(double n) {
        amount -= n;
    }

    public void showAvailableAmount() {
        System.out.println("Current wallet amount is: " + amount);
    }


}

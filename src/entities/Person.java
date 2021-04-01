package entities;

public class Person {

    private String name;
    private Wallet wallet;

    public Person(String name) {
        this.name = name;
        this.wallet = new Wallet(500);
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void purchase(double n) {
        wallet.withdraw(n);
    }

}

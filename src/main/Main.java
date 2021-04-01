package main;

import entities.Person;

public class Main {

    public static void main(String[] args) {

        Person myPerson = new Person("Panos");

        System.out.println("Hello, i am " + myPerson.getName() + ".");
        System.out.println("I currently have " + myPerson.getWallet().getAmount() + " in my wallet.");
        myPerson.purchase(30);
        System.out.println("I purchased a book for 30 euros.");
        myPerson.getWallet().showAvailableAmount();
        myPerson.purchase(150);
        System.out.println("I purchased a jacket for 150 euros.");
        myPerson.getWallet().showAvailableAmount();myPerson.purchase(80);
        System.out.println("I purchased a skate for 80 euros.");
        myPerson.getWallet().showAvailableAmount();
    }

}

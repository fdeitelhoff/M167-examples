package de.deitelhoff.m167.studymag.missions.le2;

public class Main {

    public static void main(String argv[]) {
        BankAccount bankAccount = new BankAccount(1000.5);

        if (bankAccount.withdrawAmount(1001) == -1) {
            System.out.println("Not enough money!");
        } else {
            System.out.println("The new balance is: " + bankAccount.getBalance());
        }
    }
}

package de.deitelhoff.m167.studymag.missions.le2;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int withdrawAmount(double amount) {
        if (amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}

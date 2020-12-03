package com.galvanize;

public class BankAccount {
    private String name;
    private int balance;

    public void deposit(long cents) {
        this.balance += cents;
    }

    public void withdraw(long cents) {
        this.balance -= cents;
    }

    public int balance() {
        return this.balance;
    }

    public boolean isOverDrawn() {
        return this.balance < 0;
    }
}

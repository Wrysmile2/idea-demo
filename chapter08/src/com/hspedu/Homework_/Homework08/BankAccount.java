package com.hspedu.Homework_.Homework08;

public class BankAccount {
    private double balance;  //余额

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //取款
    public void deposit(double amount) {
        balance += amount;
    }

    //存款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

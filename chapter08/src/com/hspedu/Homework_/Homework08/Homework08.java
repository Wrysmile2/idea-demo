package com.hspedu.Homework_.Homework08;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(9);
//        System.out.println(checkingAccount.getBalance());

        //测试SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        //月初，定时器自动调用一下，earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());


    }
}

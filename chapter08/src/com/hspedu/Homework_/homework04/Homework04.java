package com.hspedu.Homework_.homework04;

public class Homework04 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 20, 150, 1.2);
        jack.setBonus(2000);
        jack.PrintSalary();
        Worker milan = new Worker("milan", 22, 100, 1);
        milan.PrintSalary();

    }
}

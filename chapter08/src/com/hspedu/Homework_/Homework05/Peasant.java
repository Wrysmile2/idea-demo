package com.hspedu.Homework_.Homework05;

public class Peasant extends Employee {
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}

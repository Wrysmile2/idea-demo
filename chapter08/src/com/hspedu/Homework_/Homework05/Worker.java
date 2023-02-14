package com.hspedu.Homework_.Homework05;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void printSal() {
        System.out.print("工人 ");
        super.printSal();
    }
}

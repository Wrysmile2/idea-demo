package com.hspedu.Homework_.homework04;

public class Worker extends Employee{
    public Worker(String name, int day, double daysalary, double grade) {
        super(name, day, daysalary, grade);
    }
    public void PrintSalary(){
        System.out.print("普通员工 ");
        super.PrintSalary();
    }
}

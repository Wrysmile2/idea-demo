package com.hspedu.Homework_.Homework05;

public class Employee {
    private String name;
    private double salary;
    private int salMonth = 12;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    //打印全年工资
    public void printSal() {
        System.out.println(name + " 年工资是：" + (salary * salMonth));
    }
}

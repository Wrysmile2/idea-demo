package com.hspedu.Homework_.homework04;

public class Employee {
    private String name;
    private int day;
    private double daysalary;
    private double grade;

    public Employee(String name, int day, double daysalary, double grade) {
        this.name = name;
        this.day = day;
        this.daysalary = daysalary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getDaySalary() {
        return daysalary;
    }

    public void setDaySalary(double salary) {
        this.daysalary = daysalary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void PrintSalary() {
        System.out.println(name + " 工资是" + day * daysalary * grade);
    }
}

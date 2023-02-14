package com.hspedu.Homework_.Homework05;

public class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public void printSal() {
        System.out.print("科学家 ");
        System.out.println(getName() + " 年工资是：" + (getSalary() * getSalMonth() + bonus));
    }
}

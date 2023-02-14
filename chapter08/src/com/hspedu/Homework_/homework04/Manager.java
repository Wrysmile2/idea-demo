package com.hspedu.Homework_.homework04;

public class Manager extends Employee {
    //特有属性
    private double bonus;

    //创建Manager对象时，奖金是多少不确定，因此在构造器中，不给bonus
    public Manager(String name, int day, double daysalary, double grade) {
        super(name, day, daysalary, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void PrintSalary() {
        System.out.println("经理 " + getName() + " 工资是" + (bonus + getDay() * getDaySalary() * getGrade()));
    }
}

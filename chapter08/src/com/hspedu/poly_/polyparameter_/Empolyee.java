package com.hspedu.poly_.polyparameter_;

public class Empolyee {
    public String name;
    private double salary;

    public Empolyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //获取年工资的方法
    public double getAnnual() {
        return salary*12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

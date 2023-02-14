package com.hspedu.Homework_.Homework05;

public class Teacher extends Employee {
    private int classDays;  //一年上课次数
    private double classSal;  //课时费

    public Teacher(String name, double salary, int classDays, double classSal) {
        super(name, salary);
        this.classDays = classDays;
        this.classSal = classSal;
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public void printSal() {
        System.out.println("老师 "+getName() + " 年工资是：" + (getSalary() * getSalMonth()+classSal*classDays) );
    }

}

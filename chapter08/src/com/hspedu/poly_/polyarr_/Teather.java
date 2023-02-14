package com.hspedu.poly_.polyarr_;

public class Teather extends Person {
    private double salary;

    public Teather(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return "老师：" + super.say() + " salary=" + salary;
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在讲java课程...");
    }

}

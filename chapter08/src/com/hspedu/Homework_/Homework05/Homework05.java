package com.hspedu.Homework_.Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(10);//灵活修改带薪月份
        jack.printSal();

        Peasant smith = new Peasant("smith", 15000);
        smith.printSal();

        Waiter milan = new Waiter("milan", 10000);
        milan.printSal();

        Teacher rooick = new Teacher("Rooick", 2000);
        rooick.setClassDays(300);
        rooick.setClassSal(1000);
        rooick.printSal();

        Scientist scientist = new Scientist("终南山", 20000);
        scientist.setBonus(500000);
        scientist.printSal();

    }
}

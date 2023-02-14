package com.hspedu.Homework_;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("tom", 28, "程序员");
        person[1] = new Person("jack", 22, "教师");
        person[2] = new Person("smith", 25, "主播");
        person[3] = new Person("milan", 35, "PHP工程师");
        person[4] = new Person("peiqi",30,"大数据工程师");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        Person temp = null;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = i+1; j < person.length; j++) {
                if (person[i].age>person[j].age){
                    temp = person[i];
                    person[i] = person[j];
                    person[j] = temp;
                }
            }
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person {
    public String name;
    public int age;
    public String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

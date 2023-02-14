package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 20, 20000);
//        person.setName("jack");
//        person.setAge(20);
//        person.setSalary(20000);
        System.out.println(person.info());
        //如果我们使用构造器指定属性
        Person smith = new Person("smith", 35, 50000);
        System.out.println("=====smith的信息=====");
        System.out.println(smith.info());
    }
}

/*
不能随便查看人的年龄，工资等隐私，并对设置年龄合理的验证。年龄合理的设置，
否则默认年龄必须在1-120，年龄，工资不能直接查看，name的长度在2-6字符之间
*/
class Person {
    public String name; //名字公开
    private int age;  //年龄私有化
    private double salary; //..
    //构造器 alt+insert
    //无参构造器
//    public Person() {
//    }

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写进构造器中，仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //自己写set和get太慢，可以使用快捷键 Alt+insert
    //然后根据要求来完善底代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要(2-6)个字符，默认为无名");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄需要在1-120之间，默认年龄为18");
            this.age = 18;  //给一个默认年龄
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //增加对当前对象的权限判断
        this.salary = salary;
    }

    //写一个方法，返回信息属性
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }

}


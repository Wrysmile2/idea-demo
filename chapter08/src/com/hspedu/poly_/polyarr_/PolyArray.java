package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("jack", 20);
        person[1] = new Student("mary", 18, 100);
        person[2] = new Student("smith", 19, 30.5);
        person[3] = new Teather("jack", 40, 20000);
        person[4] = new Teather("jack", 35, 15000);

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
            if (person[i] instanceof Student) {
                Student student = (Student) person[i];
                student.study();
            } else if (person[i] instanceof Teather) {
                Teather teather = (Teather) person[i];
                teather.teach();
            }else if (person[i] instanceof Person){

            }else {
                System.out.println("输入类型有误！");
            }
        }

    }
}

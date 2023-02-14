package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog,bone);
        Master jack = new Master("jack");
        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        jack.feed(cat,fish);
    }
}

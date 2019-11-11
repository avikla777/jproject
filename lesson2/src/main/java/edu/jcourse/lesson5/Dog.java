package edu.jcourse.lesson5;

public class Dog extends Animal {
    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says Gav Gav");
    }
//    public void printAge() {
//        System.out.println(age);
//    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}

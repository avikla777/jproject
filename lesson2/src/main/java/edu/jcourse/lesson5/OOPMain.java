package edu.jcourse.lesson5;

public class OOPMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Abstract Animal");
        animal.sayHello();

        Cat cat = new Cat();
        cat.setName("Pushok");
        cat.setAge(10);
        cat.sayHello();
        cat.printAge();

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(5);
        dog.sayHello();
        dog.printAge();

        System.out.println(animal);
        System.out.println(cat);


        if (cat instanceof Animal) {
            System.out.println("Cat is an Animal");
        }

    }
}

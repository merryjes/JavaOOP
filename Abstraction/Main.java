package Abstraction;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.name = "Bogart");
        dog.makeNoise();
        dog.age = 5;
        dog.printage();
        System.out.println();

        Cat cat = new Cat();
        System.out.println(cat.name = "Bubbles");
        cat.makeNoise();
        cat.age = 3;
        cat.printage();
    }
}
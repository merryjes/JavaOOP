package Abstractionn;

public abstract class Animal {

    String name;
    int age;

    public abstract void makeNoise();

    public void printage(){
        System.out.println("I am " + age  + " years old");
    }
}
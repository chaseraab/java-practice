package oop.principles.abstraction.interfaces;

interface Flyable {
    void fly();
    default void makeSound() {
        System.out.println("I am making sound");
    }
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("I can fly");
    }
}

public class Demo1 {
    public static void main(String args[]) {
        Bird newBird = new Bird();
        newBird.fly();
        newBird.makeSound();
    }
}

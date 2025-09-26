package oop.principles.polymorphism;

class Animal {
    public void makeNoise() {
        System.out.println("Animal noise");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public void makeNoise() {
        System.out.println("Meow");
    }
}

public class Demo2 {
}

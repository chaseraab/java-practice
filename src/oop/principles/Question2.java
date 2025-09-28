package oop.principles;

class Parent1 {
    public void show() {
        System.out.println("Parent::show() called");
    }
}
class Child1 extends Parent1 {
    public void show() {
        System.out.println("Child::show() called");
    }
}

public class Question2 {

    public static void main(String args[]) {
        Parent1 p = new Child1();
        p.show();
    }

}

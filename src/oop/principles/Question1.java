package oop.principles;

class Parent {
    public void Print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void Print() {
        System.out.println("Child");
    }
}

public class Question1 {

    public static void doPrint(Parent p) {
        p.Print();
    }

    public static void main(String args[]) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        Child obj3 = new Child();
        doPrint(obj1);
        doPrint(obj2);
        doPrint(obj3);
    }

}

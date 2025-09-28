package oop.principles.abstraction;

abstract class AbstractClass {
    public abstract void incompleteMethod1();
    public abstract void incompleteMethod2();
    public void completeMethod() {System.out.println("this is a complete method");}
}

abstract class concreteClass extends AbstractClass {
    public void incompleteMethod1() {
        System.out.println("Method 1 is now complete");
    }
    public void incompleteMethod2() {
        System.out.println("Method 2 is now complete");
    }
}

public class Demo1 {
    public static void main(String args[]) {
        concreteClass cc = new concreteClass() {};
        cc.incompleteMethod1();
        cc.incompleteMethod2();
    }

}

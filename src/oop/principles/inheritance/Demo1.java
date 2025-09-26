package oop.principles.inheritance;

class ParentClass{
    private int a;
    private int b;
    ParentClass(int a, int b) {
        System.out.println("I'm in the parent constructor");
        System.out.println("Before setting a " + this.a);
        System.out.println("Before setting b " + this.b);
        System.out.println("Setting the values for instance variables a and b");
        this.a = a;
        this.b = b;
        System.out.println("Now a=" + this.a);
        System.out.println("Now b=" + this.b);
    }
    void parentClassMethod() {
        System.out.println("I am a parent method");
    }

}

class ChildClass extends ParentClass {
    private int c;
    ChildClass(int a, int b, int c) {
        super(a, b);
        System.out.println("I am in child constructor");
        System.out.println("Before setting c: " + this.c);
        this.c = c;
        System.out.println("Now c = " + this.c);
    }
    void childClassMethod() {
        System.out.println("I am a child method");
        System.out.println("I am calling the parent method");
        super.parentClassMethod();
    }
}

//class GrandChildClass extends ChildClass {
//    int a = 3;
//    GrandChildClass() {
//        System.out.println("GrandChild constructor");
//    }
//
//    @Override
//    public void printStatus() {
//        System.out.println("I'm a grand child");
//    }
//}

public class Demo1 {
    public static void main(String args[]) {
        ChildClass sampleObj = new ChildClass(1,2,3);
        sampleObj.childClassMethod();
    }
}

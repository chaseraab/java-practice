package oop.principles.polymorphism;

class ParentClass {
    public static void printStatic(){
        System.out.println("static from ParentClass");
    }
    public void printDynamic(){
        System.out.println("dynamic from parentClass");
    }
}

class ChildClass extends ParentClass {
    public static void printStatic() {
        System.out.println("static from ChildClass");
    }
    public void printDynamic() {
        System.out.println("dynamic from ChildClass");
    }
}

public class Demo3 {
    public static void main (String args[]) {
        ParentClass pc = new ChildClass();
        pc.printStatic();
        pc.printDynamic();
        ChildClass cc = new ChildClass();
        cc.printStatic();
        cc.printDynamic();
    }
}

package access.modifiers;

public class Test {

    {
        System.out.println("Static block");
    }
    static {
        System.out.println("Now this block is executing");
    }

    public Test() {
        System.out.println("The constructor is executing");
    }

}

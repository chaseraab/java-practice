//single comment
/*
mutli
line
comment
 */

public class JavaPractice {
    public static void main (String args[]) {
        System.out.println("Hello \"World\"");
        String name = "John";
        int age = 34;
        age += 5;
        System.out.println(name);
        System.out.println(age);
        System.out.println(name + age);
        boolean mybool = false;
        boolean yourbool = false;
        if (mybool) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        char testChar = 65;
        System.out.println(testChar);

        System.out.println(Math.min(1,2));

        MySwitch ms = new MySwitch();
        ms.useSwitch(5);
        ms.useSwitch(1);
        ms.useSwitch(10);
        ms.useSwitch(8);

        for (int i = 0; i <= 10; i = i + 2){
            if (i == 2) {
                continue;
            } else if (i == 8) {
                break;
            }
            System.out.println(i);
        }

        String[] cars = {"Volvo", "Chevy", "Ford", "Mazda", "BMW"};
        for (String car: cars) {
            System.out.println(car);
        }

    }
}

class MySwitch {

    MySwitch() {}

    public void useSwitch(int protocol){
            switch (protocol) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Cases 1-4");
                    break;
                case 5:
                    System.out.println("Case 5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("Cases 6-9");
                    break;
                default:
                    System.out.println("Protocol is not 1-9");
        }
    }
}

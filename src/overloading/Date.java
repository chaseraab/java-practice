package overloading;

public class Date {

    private int day;
    private int month;
    private int year;

    private static int staticCounter = 0;

    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    public Date (int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void staticMethod() {
        System.out.println(staticCounter);
        staticCounter++;
    }

}

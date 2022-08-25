package august2522;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println(args);
        doSmth1();
    }

    public static void doSmth1() {
        doSmth2();
//        System.out.println(10/0);
    }

    public static void doSmth2() {
        System.out.println();
    }
}

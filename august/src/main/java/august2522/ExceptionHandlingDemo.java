package august2522;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.stream.IntStream;

public class ExceptionHandlingDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            System.out.println("Hello");
//            System.out.println(10 / 0);
//            String str = null;
//            System.out.println(str.toString());
//        }
//        finally {
//            System.out.println("finally");
//        }
//        System.out.println("main method terminated normally");

        //valid during compile time
//        try {
//            try {
//                System.out.println("inside try");
//            }
//            catch (ArithmeticException exc) {
//                System.out.println(exc);
//            }
//        }
//        catch (ArithmeticException exc) {
//
//        }
//        finally {
//            System.out.println("x");
//        }
//        catch (FileNotFoundException exc) {
//            System.out.println("File not found");
//        }
        doSmth1();
    }

    public static void doSmth1() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("x");
//        doSmth2();
////        System.out.println(10/0);
    }

    public static void doSmth2() {
        System.out.println();
    }
}


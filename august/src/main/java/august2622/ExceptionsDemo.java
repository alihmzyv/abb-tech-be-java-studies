package august2622;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsDemo extends Throwable{
    //can throw only instances of Throwable
    static ArithmeticException exc;
    ExceptionsDemo() throws ExceptionsDemo {
//        throw new Throwable("x");
    }
    public static void main(String[] args) throws InterruptedException {
//        PrintWriter printWriter = new PrintWriter("x");
//        System.out.println("x");
//        throw new Throwable("User-defined");
//        throw new Exception("x");
//        Thread.sleep(1000);
        //used throws to declare it to be thrown
        //or catch
//        try {
//            Thread.sleep(100);
//        }
//        catch (InterruptedException exc) {
//            System.out.println(exc);
//        }
//        try {
//            doSomething();
//            System.out.println("x");
//        }
//        catch (Throwable exc) {
//
//        }
//        catch (InterruptedException exc) {
//
//        }
    }

    public static void doSomething() throws InterruptedException {
        System.out.println("x");
//        Thread.sleep(1000);
    }

    public static void doSomething2(){
        FileNotFoundException x = new FileNotFoundException();
//        throw (Exception) x;
        //while Exception is partially checked there is possibility of the exception to be an instance of fully checked as well
        //thus instance of partially-checked exception is checked
    }

    public static void doSomething3() {
        throw new Error();
    }
}

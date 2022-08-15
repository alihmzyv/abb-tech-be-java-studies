package august1522.danit;

import java.util.*;

public class MultiThreadingDemo {
    public static void main(String[] args) {
//        FuncInterface funcInterface = a -> a % 10;
//        System.out.println(funcInterface.getClass().getName());
////        FuncInterface funcInterface = new X();
//        funcInterface.defaultMethod();
//        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Main Thread");
//        }

//        Runnable runnable = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("runnable thread");
//            }
//        };
//        Thread t = new Thread(runnable);
//        t.start();

        List<String> integerList = new ArrayList<>(Arrays.asList("x", "y", "z"));
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}


@FunctionalInterface
interface FuncInterface {
    int lastDigit(int a);

    static int sum(int a, int b) {
        return a + b;
    }

    default void defaultMethod() {
        System.out.println("default");
    }
}

class MyRunnable extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable Thread");
        }
    }
}

class X implements FuncInterface {
    @Override
    public int lastDigit(int a) {
        return a % 10;
    }
}

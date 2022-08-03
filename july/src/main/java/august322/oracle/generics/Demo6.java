package august322.oracle.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
//        List<Integer> li = Arrays.asList(1, 2, 3);
//        printList(li);
//        System.out.println("sum = " + sumOfList(li));
//        List<Integer> intList = new ArrayList<>();
//        List<? extends Number> numList = new ArrayList<>();
//        numList.add();
        List<Integer> intList = new ArrayList<>();

    }

//    public static <T extends Number> int doSomething(List<T> list) {
//
//    }
//
//    void foo(List<?> i) {
//        fooHelper(i);
//    }
//
//
//    // Helper method created so that the wildcard can be captured
//    // through type inference.
//    private <T> void fooHelper(List<T> l) {
//        l.set(0, T );
//    }

//    public static List<? super Integer> getListOf(Object... objects) {
//        List<? super Integer> list = new ArrayList<>();
//
//        for (var obj: objects) {
//
//        }
//    }



    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static <T extends Number> double sumOfList(List<? extends Number> list) {
        double sum = 0;

        for (Number num: list) {
            sum += num.doubleValue();
        }

        return sum;
    }
}

package august2422;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class CollectionsReferenceDemo {
    public static void main(String[] args) {
        //Java complete reference 12th edition reading
        //List interface
        List<Integer> integerList = Arrays.asList(1, 2, 3, null);
        System.out.println(integerList);
//        List<Integer> nonNull = List.copyOf(integerList); //integerList not allowed to contain null
//        System.out.println(nonNull);
//        List.of(null, 1, 2); //null not allowed as parameter here
        ListIterator<Integer> listIterator = integerList.listIterator();
        ListIterator<Integer> listIterator2 = integerList.listIterator(1);
    }
}

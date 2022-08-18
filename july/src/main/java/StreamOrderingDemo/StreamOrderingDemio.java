package StreamOrderingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOrderingDemio {
    public static void main(String[] args) {
        //even in parallel the encounter order is the order of collection and preserved, e.g.;
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, -5));
        int[] firstThree = integerList.stream().limit(3).mapToInt(i -> i).toArray(); //1, 4, 5
        int[] firstThree2 = integerList.stream().parallel().limit(3).mapToInt(i -> i).toArray(); //1, 4, 5
        System.out.printf("arr1: %s\narr2: %s\n", Arrays.toString(firstThree), Arrays.toString(firstThree2));

        //make unordered
        int[] firstThree3 = integerList.stream().parallel().unordered().mapToInt(i -> i).toArray(); //cant predict
        System.out.printf("arr3: %s", Arrays.toString(firstThree3));

        //sorted will create new order

        //forEach vs forEachOrdered
        integerList.stream().forEach(System.out::println);


    }
}

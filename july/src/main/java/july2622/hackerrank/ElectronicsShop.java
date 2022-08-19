package july2622.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElectronicsShop {
    public static void main(String[] args) {
        //take inputs
        Scanner in = new Scanner(System.in);
        Function<String, SortedSet<Integer>> convertStringtoIntegerList = s -> Arrays.stream(s.split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toCollection(TreeSet::new));

        int budget = convertStringtoIntegerList.apply(in.nextLine()).first(); //no need to save the lengths
        SortedSet<Integer> pricesOfKeyboards = convertStringtoIntegerList.apply(in.nextLine());
        SortedSet<Integer> pricesOfDrives = convertStringtoIntegerList.apply(in.nextLine());
        in.close();


        System.out.println();
    }

    public static Integer[] convertStrArrtintArr(String[] arrStr) {
        Integer[] arr = new Integer[arrStr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        return arr;
    }
}

package easy;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        //according to problem statement:
        //Each string is guaranteed to represent a positive integer.
        //There will be no leading zeros.
        unsorted.sort(Comparator.comparingInt(String::length).thenComparing(s -> new BigInteger(s)));
        return unsorted;
    }
}

package august922.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        return arr.size() - arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getValue()
                .intValue();
    }
}

package july2822.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        IntStream.range(0, k)
                .forEach(i -> a.add(0, a.remove(a.size() - 1)));
        return queries.stream()
                .map(a::get)
                .collect(Collectors.toList());
    }
}

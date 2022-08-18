package july2522.hackerrank;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = (int) ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .parallelStream()
                .map(socks -> socks.getValue() / 2)
                .mapToLong(i -> i)
                .sum();
        return pairs;
    }
}

package july2522.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MigratoryBirds {
    public static void main(String[] args) {

    }
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> integerCountMap = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int mostFrequentID = integerCountMap.entrySet().stream().max((entry1, entry2) -> {
            long flag = entry1.getValue() - entry2.getValue();
            if (flag == 0) {
                flag = -entry1.getKey().compareTo(entry2.getKey());
            }
            return (int) flag;
        }).get().getKey();

        return mostFrequentID;
    }
}

package august922.hackerrank;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> numOfSticks = new ArrayList<>();
        while (!arr.isEmpty()) {
            numOfSticks.add(arr.size());
            int min = arr.stream()
                    .mapToInt(i -> i).min().getAsInt();
            arr = arr.stream()
                    .map(i -> i - min)
                    .filter(i -> i != 0)
                    .collect(Collectors.toList());
        }
        return numOfSticks;
    }
}

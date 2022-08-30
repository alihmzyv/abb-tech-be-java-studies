package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class GamingArray {
    public static String gamingArray(List<Integer> arr) {
        // Write your code here
        int countMoves = 0;
        while (!arr.isEmpty()) {
            arr = arr.subList(0, arr.indexOf(arr.stream().max(Comparator.naturalOrder()).get()));
            countMoves++;
        }
        return countMoves % 2 == 0 ? "ANDY" : "BOB";
    }
}

package july2622.hackerrank;

import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int diff = height.stream()
                .mapToInt(i -> i)
                .max().getAsInt() - k;
        return Math.max(diff, 0);
    }
}

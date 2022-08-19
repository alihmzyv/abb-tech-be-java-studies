package august222.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class KClosestPointstoOrigin973 {
    public int[][] kClosest(int[][] points, int k) {
        return Arrays.stream(points)
                .sorted(Comparator.comparingDouble(arr -> Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1])))
                        .limit(k)
                                .toArray(int[][]::new);
    }
}

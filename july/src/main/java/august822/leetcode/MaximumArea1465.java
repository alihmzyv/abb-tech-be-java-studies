package august822.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumArea1465 {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxHeight = IntStream.rangeClosed(0, horizontalCuts.length)
                .map(i -> {
                    if (i == 0) return horizontalCuts[i];
                    else if (i == horizontalCuts.length) return h - horizontalCuts[i - 1];
                    return horizontalCuts[i] - horizontalCuts[i - 1];
                })
                .max().getAsInt();

        long maxWidth = IntStream.rangeClosed(0, verticalCuts.length)
                .map(i -> {
                    if (i == 0) return verticalCuts[i];
                    else if (i == verticalCuts.length) return w - verticalCuts[i - 1];
                    return verticalCuts[i] - verticalCuts[i - 1];
                })
                .max().getAsInt();

        return (int) (maxWidth * maxHeight % (int) (Math.pow(10, 9) + 7));
    }
}

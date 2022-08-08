package august822.leetcode;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumArea1465 {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxHorizontalDistanceBetweenCuts = getMaxDistanceBetweenCuts(horizontalCuts, h);
        long maxVerticalDistanceBetweenCuts = getMaxDistanceBetweenCuts(verticalCuts, w);

        return (int) ((maxHorizontalDistanceBetweenCuts * maxVerticalDistanceBetweenCuts) % (int) (Math.pow(10, 9) + 7));
    }

    public int getMaxDistanceBetweenCuts(int[] cuts, int sideSize) {
        Arrays.sort(cuts);
        SortedSet<Integer> distancesBetweenCuts = new TreeSet<>();

        for (int i = 0; i <= cuts.length; i++) {
            if (i == 0) {
                distancesBetweenCuts.add(cuts[i]); //distance between 0 and first cut
            }
            else if (i == cuts.length) {
                distancesBetweenCuts.add(sideSize - cuts[i - 1]); //distance between the last cut and sideSize (h or w)
            }
            else {
                distancesBetweenCuts.add(cuts[i] - cuts[i - 1]);
            }
        }

        return distancesBetweenCuts.last();
    }
}

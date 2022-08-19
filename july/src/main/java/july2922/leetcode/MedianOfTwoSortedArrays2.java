package july2922.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> joined = new ArrayList<>();
        joined.addAll(Arrays.stream(nums1).boxed().toList());
        joined.addAll(Arrays.stream(nums2).boxed().toList());
        Collections.sort(joined);
        double median;
        int size = joined.size();
        if (size % 2 != 0) {
            median = joined.get(size / 2);
        }
        else {
            median = (double) (joined.get(size / 2) + joined.get(size / 2 - 1)) / 2;
        }

        return median;
    }
}

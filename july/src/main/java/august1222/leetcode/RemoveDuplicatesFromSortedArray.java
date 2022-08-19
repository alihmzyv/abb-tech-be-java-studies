package august1222.leetcode;


import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] uniques = Arrays.stream(nums)
                .distinct()
                .toArray();

        System.arraycopy(uniques, 0, nums, 0, uniques.length);
        return uniques.length;
    }
}

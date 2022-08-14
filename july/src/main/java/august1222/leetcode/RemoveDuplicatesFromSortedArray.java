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
        Integer[] numsIntegerArr = IntStream.of(nums).boxed().toArray( Integer[]::new );
        SortedSet<Integer> uniqueNums = new TreeSet<>(Arrays.asList(numsIntegerArr));
        Iterator<Integer> uniqueNumsIterator = uniqueNums.iterator();
        for (int i = 0; uniqueNumsIterator.hasNext(); i++) {
            nums[i] = uniqueNumsIterator.next();
        }
        return uniqueNums.size();
    }
}

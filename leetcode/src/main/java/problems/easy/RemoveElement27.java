package problems.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int[] frontOfArray = Arrays.stream(nums).filter(num -> num != val)
                        .toArray();
        System.arraycopy(frontOfArray, 0, nums, 0, frontOfArray.length);
        return frontOfArray.length;
    }
}

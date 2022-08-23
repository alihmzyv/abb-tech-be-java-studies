package problems.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max = nums.length;
        return IntStream.rangeClosed(0, max)
                .filter(i -> Arrays.binarySearch(nums, i) < 0)
                .findFirst()
                .getAsInt();
    }
}

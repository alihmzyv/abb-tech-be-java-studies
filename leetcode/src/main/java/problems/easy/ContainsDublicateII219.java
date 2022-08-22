package problems.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ContainsDublicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (Arrays.stream(nums).distinct().count() == nums.length) { //if there is no dublicate at all
            return false;
        }


        int length = nums.length;
        return IntStream.range(0, length- 1)
                .anyMatch(i -> {
                    if (i + k > length - 1) {
                        return IntStream.range(i + 1, length).anyMatch(j -> nums[i] == nums[j]);
                    }
                    return IntStream.rangeClosed(i + 1, i + k).anyMatch(j -> nums[i] == nums[j]);
                });
    }
}

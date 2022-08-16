package problems.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        List<Integer> numsList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        Arrays.sort(nums);
        int firstIndex = numsList.indexOf(val);
        if (firstIndex == -1) {
            return nums.length;
        }
        int lastIndex = numsList.lastIndexOf(val);
        System.arraycopy(nums, lastIndex + 1, nums, firstIndex, nums.length - lastIndex - 1);
        return nums.length - (lastIndex - firstIndex + 1);
    }
}

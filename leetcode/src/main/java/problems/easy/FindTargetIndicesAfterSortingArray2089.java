package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTargetIndicesAfterSortingArray2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        return IntStream.range(0, nums.length)
                .filter(i -> nums[i] == target)
                .boxed()
                .collect(Collectors.toList());
    }
}

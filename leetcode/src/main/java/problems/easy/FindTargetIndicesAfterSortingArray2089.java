package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTargetIndicesAfterSortingArray2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> targetIndices = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int firstIndex = numsList.indexOf(target);
        if (firstIndex == -1) {
            return targetIndices;
        }
        int lastIndex = numsList.lastIndexOf(target);
        for (int i = firstIndex; i <= lastIndex; i++) {
            targetIndices.add(i);
        }
        return targetIndices;
    }
}

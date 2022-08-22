package problems.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDublicate217 {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
    }
}

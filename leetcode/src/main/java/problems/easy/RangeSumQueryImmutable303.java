package problems.easy;

import java.util.Arrays;

public class RangeSumQueryImmutable303 {
}

class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums; //careful, not copying
    }

    public int sumRange(int left, int right) {
        return Arrays.stream(Arrays.copyOfRange(nums, left, right + 1)).sum();
    }
}

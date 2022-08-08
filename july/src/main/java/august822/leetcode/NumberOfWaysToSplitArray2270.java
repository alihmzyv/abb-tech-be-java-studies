package august822.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfWaysToSplitArray2270 {
    public int waysToSplitArray(int[] nums) {
        long sumOfNums = getSumOfArray(nums);
        long sumOfNumsTillSplit = 0;
        long sumOfNumsAfterSplit = sumOfNums - sumOfNumsTillSplit;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sumOfNumsTillSplit += nums[i];
            sumOfNumsAfterSplit -= nums[i];

            if (sumOfNumsTillSplit >= sumOfNumsAfterSplit) {
                count++;
            }
        }

        return count;
    }

    public long getSumOfArray(int[] arr) {
        long sum = 0;

        for (int num: arr) {
            sum += num;
        }

        return sum;
    }
}

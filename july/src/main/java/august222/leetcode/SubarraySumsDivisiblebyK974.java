package august222.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarraySumsDivisiblebyK974 {
    public int subarraysDivByK(int[] nums, int k) {
        int countSubarraysDivisiblebyK = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length + 1; j++) {
                if (getSumOfArray(Arrays.copyOfRange(nums, i, j)) % k == 0) {
                    countSubarraysDivisiblebyK++;
                }
            }
        }

        return countSubarraysDivisiblebyK;
    }

    public static int getSumOfArray(int[] arr) {
        //returns the sum of all the elements of an array
        int sum = 0;

        for (int num: arr) {
            sum += num;
        }

        return sum;
    }
}

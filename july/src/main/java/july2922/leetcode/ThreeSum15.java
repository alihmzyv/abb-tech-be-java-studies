package july2922.leetcode;

import java.util.*;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Integer[] triplet;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (addsUpToZero(nums[i], nums[j], nums[k])) {
                        triplet = new Integer[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(triplet);
                        if (!result.contains(Arrays.asList(triplet))) {
                            result.add(Arrays.asList(triplet));
                        }
                    }
                }
            }
        }

        return result;
    }

    public static boolean addsUpToZero(int i, int j, int k) {

        return i + j + k ==0;
    }
}

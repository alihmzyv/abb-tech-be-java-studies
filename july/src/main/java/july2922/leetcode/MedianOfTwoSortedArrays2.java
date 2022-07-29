package july2922.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median; //return
        int[] mergedArray = new int[nums1.length + nums2.length]; //merged array

        //merge arrays
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);


        Arrays.sort(mergedArray); //sort merged array

        if (mergedArray.length % 2 != 0) {
            median = mergedArray[(mergedArray.length - 1) / 2];
        }
        else {
            median = (double) (mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2;
        }

        return median;
    }
}

package july2622.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int[] arr = a.stream().mapToInt(i->i).toArray();
        int[] arrWithNoDubs = Arrays.stream(arr).distinct().toArray();

        int[] longestSubarray;
        int[] previousLongestSubarray = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arrWithNoDubs.length; i++) {
            longestSubarray = new int[0];
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arrWithNoDubs[i] - arr[j]) <= 1) {
                    longestSubarray = Arrays.copyOf(longestSubarray, longestSubarray.length + 1);
                    longestSubarray[longestSubarray.length - 1] = arr[j];
                }
            }

            if (longestSubarray.length >= previousLongestSubarray.length) {
                previousLongestSubarray = Arrays.copyOf(longestSubarray, longestSubarray.length);
            }
        }

        return previousLongestSubarray.length;
    }
}

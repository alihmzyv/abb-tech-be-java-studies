package july2522.hackerrank;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int[] arr = ar.stream().mapToInt(i->i).toArray();
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

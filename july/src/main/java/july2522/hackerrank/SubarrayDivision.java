package july2522.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int[] sArr = s.stream().mapToInt(i->i).toArray();
        int count = 0;

        for (int i = 0; i <= sArr.length - m; i++) {
            if (sumArray(Arrays.copyOfRange(sArr, i, i + m)) == d) {
                count++;
            }
        }

        return count;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int num: arr) {
            sum+=num;
        }

        return sum;
    }
}

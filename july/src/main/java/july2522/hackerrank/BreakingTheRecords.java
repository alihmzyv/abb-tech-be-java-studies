package july2522.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int[] scoresArr = scores.stream().mapToInt(i->i).toArray();
        int countBreaksBestRecord = 0;
        int countBreaksWorstRecord = 0;

        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] > getMinAndMax(Arrays.copyOfRange(scoresArr, 0, i))[1]) {
                countBreaksBestRecord++;
            }
            if (scoresArr[i] < getMinAndMax(Arrays.copyOfRange(scoresArr, 0, i))[0]) {
                countBreaksWorstRecord++;
            }
        }

        return Arrays.stream(new Integer[]{countBreaksBestRecord, countBreaksWorstRecord}).toList();
    }

    public static int[] getMinAndMax(int[] arr) {
        int min;
        int max;
        min = max = arr[0];

        for (int num: arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return new int[]{min, max};
    }
}

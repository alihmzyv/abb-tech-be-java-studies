package july2522.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int[] countBestRecord = new int[]{0};
        int[] countWorstRecord = new int[]{0};
        scores.stream().mapToInt(i -> i).reduce(scores.get(0), (previous, score) -> {
            if (score > previous) {
                countBestRecord[0]++;
                previous = score;
            }
            return previous;
        });
        scores.stream().mapToInt(i -> i).reduce(scores.get(0), (previous, score) -> {
            if (score < previous) {
                countWorstRecord[0]++;
                previous = score;
            }
            return previous;
        });

        return List.of(countBestRecord[0], countWorstRecord[0]);
    }
}

package july2622.hackerrank;

import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int[] heightsOfHurdles = height.stream().mapToInt(i->i).toArray(); //convert to array that is faster
        int minDoseRequired = 0;
        Arrays.sort(heightsOfHurdles); //highest hurdle = the last element

        if (k < heightsOfHurdles[heightsOfHurdles.length - 1]) {
            minDoseRequired = heightsOfHurdles[heightsOfHurdles.length - 1] - k;
        }

        return minDoseRequired;
    }
}

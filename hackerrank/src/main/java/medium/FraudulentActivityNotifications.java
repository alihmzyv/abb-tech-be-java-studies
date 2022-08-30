package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class FraudulentActivityNotifications {
    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        //take the stream of expenditure, skipping first d days
        //for each day, filter the expenditure which is compared to the median sublist of expenditure (i - d, i)
        //count


        //returns the median of list
        ToDoubleFunction<List<Integer>> getMedian = list -> {
            list = new ArrayList<>(list); //modifiable
            list.sort(null);
            int size = list.size();
            if (d % 2 == 0) {
                return 0.5 * (list.get(size / 2) + list.get(size / 2 - 1));
            }
            return list.get((size - 1) / 2).doubleValue();
        };


        return (int) IntStream.range(d, expenditure.size())//skipped first d days
                .filter(i -> expenditure.get(i) >= 2 * getMedian.applyAsDouble(expenditure.subList(i - d, i)))
                .count();
    }
}

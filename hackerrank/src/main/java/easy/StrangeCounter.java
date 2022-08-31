package easy;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StrangeCounter {
    public static long strangeCounter(long t) {
        long nearestInitialTime = LongStream.iterate(1, i -> i <= t, i -> 2 * i + 2)
                .max()
                .getAsLong();
        return nearestInitialTime + 2 - (t - nearestInitialTime);
    }
}

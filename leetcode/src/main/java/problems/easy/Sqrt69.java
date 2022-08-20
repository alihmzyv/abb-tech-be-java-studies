package problems.easy;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Sqrt69 {
    public int mySqrt(int x) {
        return (int) LongStream.rangeClosed(1, x)
                .filter(i -> i * i <= x)
                .max().getAsLong();
    }
}

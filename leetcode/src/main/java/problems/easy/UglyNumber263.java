package problems.easy;

import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class UglyNumber263 {
    //time limit test
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        IntPredicate isPrime = num -> {
            if (num == 1) {
                return false;
            }
            if (num == 2) {
                return true;
            }
            return IntStream.range(2, num)
                    .noneMatch(factor -> num % factor == 0);
        };

        Set<Integer> beautifulPrimeFactors = Set.of(2, 3, 5);
        return IntStream.rangeClosed(1, n)
                .filter(factor -> n % factor == 0 && isPrime.test(factor))
                .allMatch(beautifulPrimeFactors::contains);
    }
}

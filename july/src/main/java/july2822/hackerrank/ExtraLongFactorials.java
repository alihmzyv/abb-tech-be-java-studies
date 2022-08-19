package july2822.hackerrank;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExtraLongFactorials {
    public static void extraLongFactorials(int n) {
        if (n == 0) {
            n = 1; //factorial of 0 is equal to factorial of 1 anyway
        }
        BigInteger unit = new BigInteger(String.valueOf(1));
        BigInteger fact = Stream.iterate(unit, bigInteger -> bigInteger.add(unit))
                .limit(n)
                .reduce(unit, BigInteger::multiply);

        System.out.println(fact);
    }
}

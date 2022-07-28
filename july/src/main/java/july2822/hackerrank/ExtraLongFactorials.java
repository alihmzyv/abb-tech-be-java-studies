package july2822.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void extraLongFactorials(int n) {
        BigInteger fact = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(fact);
    }
}

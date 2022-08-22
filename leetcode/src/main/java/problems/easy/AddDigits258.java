package problems.easy;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class AddDigits258 {
    public int addDigits(int num) {
        //using recursion
        if (num % 10 == num) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}

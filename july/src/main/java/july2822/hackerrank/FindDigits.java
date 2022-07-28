package july2822.hackerrank;

public class FindDigits {
    public static int findDigits(int n) {
        int count = 0;
        int tempN = n;
        int digit;

        while (tempN > 0) {
            digit = tempN % 10;

            if (digit != 0 && n % digit == 0) {
                count++;
            }

            tempN /= 10;
        }

        return count;
    }
}

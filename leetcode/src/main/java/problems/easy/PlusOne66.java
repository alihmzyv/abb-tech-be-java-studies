package problems.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int i;
        for (i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                break;
            }
        }
        if (i == -1) {
            int[] digitsNew = new int[digits.length + 1];
            System.arraycopy(digits, 0, digitsNew, 1, digits.length);
            digitsNew[0] = 1;
            return digitsNew;
        }
        else {
            digits[i] = ++digits[i];
            return digits;
        }
    }
}

package november42022.tasksgiven.solution20;

import java.util.Arrays;

public class SumOddsDemo {
    public static void main(String[] args) {
        int sumOfOddNumbers = getSumOfOddNumbers(new int[]{1, 2, 3, 4});
        System.out.println(sumOfOddNumbers);
    }

    public static int getSumOfOddNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(i -> i % 2 != 0)
                .sum();
    }
}

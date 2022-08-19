package august922.codewars;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

public class WeightForWeight {
    public static String orderWeight(String strng) {
        if (Pattern.matches("\\D*", strng)) { //if string do not contain any number
            return "";
        }

        ToIntFunction<String> sumDigits = s -> {
            Long number = Long.parseLong(s);
            int digitsSum = 0;
            while (number > 0) {
                digitsSum += number % 10;
                number /= 10;
            }

            return digitsSum;
        };

        return Arrays.stream(strng.trim().split("\\D+"))//split by any non-number character
                .sorted()
                .sorted(Comparator.comparingInt(sumDigits))
                .reduce((s1, s2) -> s1 + " " + s2)
                .get();
    }

}
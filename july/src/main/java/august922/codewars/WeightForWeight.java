package august922.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class WeightForWeight {
    public static String orderWeight(String strng) {
        if (Pattern.matches("\\D*", strng)) { //if string do not contain any number
            return "";
        }

        //get String array of weights
        String[] strArrayOfWeights = strng.trim().split("\\D+"); //split by any non-number character


        //convert String array of weights into List of Longs
        List<Long> weights = new ArrayList<>();
        for (String weigth : strArrayOfWeights) {
            weights.add(Long.parseLong(weigth));
        }

        //comparator for sorting according to the sum of digits
        Comparator<Long> compBySumOfDigits = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                int result = sumOfDigits(o1) - sumOfDigits(o2);

                if (result == 0) {
                    result = String.valueOf(o1).compareTo(String.valueOf(o2));
                }

                return result;
            }
        };

        //sort weight by sum of digits
        Collections.sort(weights, compBySumOfDigits);

        //convert into String
        String listToString = weights.toString();
        String result = listToString.substring(1, listToString.length() - 1).replace(",", "");
        return result;
    }

    public static int sumOfDigits(Long num) {
        int sumOfDigits = 0;

        for (Long tempNum = num; tempNum > 0; tempNum /= 10) {
            sumOfDigits += tempNum % 10;
        }

        return sumOfDigits;
    }
}
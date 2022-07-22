package july1822;

import javax.swing.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class july1822 {
    public static void main(String[] args) {
        System.out.println(listSquared(1, 250));
    }

    //codewars
    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder();
        if(Pattern.matches("[a-zA-Z]+[-|_[a-zA-Z]+]+", s)) {
            String[] words = s.split("-|_");
            for (int i = 0; i < words.length; i++) {
                if(i == 1) {
                    sb.append(words[i]);
                }
                else {
                    sb.append(String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1));
                }
            }
        }
        else return "not correct regex";
        return sb.toString();
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for(int num: numbers) {
            sb.append(num);
        }

        return sb.toString().replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }

    //xbonacci
    public double[] tribonacci(double[] s, int n) {
        if(n == 0) return new double[0];
        else {
            double[] sequence = new double[n];

            for (int i = 0; i < sequence.length; i++) {
                try {
                    sequence[i] = s[i];
                }
                catch (ArrayIndexOutOfBoundsException exc) {
                    sequence[i] = sequence[i-1] + sequence[i-2] + sequence[i-3];
                }
            }
            return sequence;
        }
    }

    public static long findNb(long m) {
        int sumOfCubVols = 0;
        int n;

        for (n = 1; sumOfCubVols < m; n++) {
            sumOfCubVols += n ^ 3;
        }

        if (sumOfCubVols == m) {
            return n;
        }
        else return -1;
    }

    static String encode(String word) {
        StringBuilder sb = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                sb.append("(");
            }
            else {
                sb.append(")");
            }
        }

        word = sb.toString();
        return word;
    }

    public static String listSquared(long m, long n) {
        long[][] result = new long[0][2];
        int sumOfSquaredDivs;
        boolean sumOfSquaredDivsIsSquare;

        for (long i = m; i < n; i++) {
            sumOfSquaredDivs = 0;
            sumOfSquaredDivsIsSquare = false;

            for (long j = 1; j <= i; j++) {
                if(i % j ==0) {
                    sumOfSquaredDivs+= j*j;
                }
            }

            for (long j = 1; j < sumOfSquaredDivs; j++) {
                if (j * j ==sumOfSquaredDivs) {
                    sumOfSquaredDivsIsSquare = true;
                    break;
                }
            }

            if (sumOfSquaredDivsIsSquare) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1][0] = i;
                result[result.length - 1][1] = sumOfSquaredDivs;
            }

        }

        return Arrays.deepToString(result);
    }

    public static int countSmileys(String[] arr) {
        if(arr == null) {
            return 0;
        }

        int countSmileyFaces = 0;
        for(String face: arr) {
            if(Pattern.matches("[:|;]{1}[-|~]?[)|D]{1}", face)) {
                countSmileyFaces++;
            }
        }
        return countSmileyFaces;
    }

    public static String camelCase(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        String[] words = str.split("' '+");
        StringBuilder sb = new StringBuilder();

        for(String word: words) {
            sb.append(word.substring(0,1).toUpperCase() + word.substring(1));
        }

        return sb.toString();
    }

    public int solution(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if(i % 3 == 0) {
                sum+=i;
            }
            else if(i % 5 ==0) {
                sum+=i;
            }
        }

        return sum;
    }
}

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Random;
import java.util.Scanner;

//codewars
public class july1222 {
    public static void main(String[] args) {
        System.out.println(isIsogram("aba"));
        System.out.println(getCount("abracadabra"));
        System.out.println(validatePin("123a"));
        System.out.println(BitCounting(1234));
    }
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        if(str.length()==0 || str == null) {
            return true;
        }
        else {
            for(int i=0; i<str.length(); i++) {
                if(str.substring(i+1).indexOf(str.charAt(i))!=-1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        String empty = "";
        for(int i=0; i<str.length(); i++) {
            if(Pattern.matches("[aeiou]", empty+str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }


    public static boolean validatePin(String pin) {
        if(Pattern.matches("\\d{4}||\\d{6}", pin)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean solution(String str, String ending) {
        return (str.endsWith(ending));
    }

    public static int BitCounting(int n){
        int sum = 0;

        int num = Integer.parseInt(Integer.toBinaryString(n));

        while(num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public String toJadenCase(String phrase) {
        String[] words;
        StringBuilder sb = new StringBuilder();
        if(phrase.length()==0 || phrase == null) {
            return null;
        }
        else {
            words = phrase.split(" ");
            for(String word: words) {
                sb.append((char) (word.charAt(0)+32)).append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static double findUniq(double arr[]) {
        double constant = -1;
        double unique = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]) {
                constant = arr[i];
                break;
            }
        }
        for(var num: arr) {
            if (num!=constant) {
                unique = num;
                break;
            }
        }

        return unique;
    }

    public static int sequence(int[] arr) {
        int sum = 0;
        int tempSum = 0;

        boolean arrIsNegativeOrEmpty = true;

        for (var num: arr) {
            if(num>=0) arrIsNegativeOrEmpty = false;
            break;
        }
        if (arr.length == 0) arrIsNegativeOrEmpty = true;

        if(arrIsNegativeOrEmpty) return sum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                tempSum+=arr[j];
                if(tempSum>sum) sum = tempSum;
                break;
            }
            tempSum = 0;
        }

        return sum;
    }
}

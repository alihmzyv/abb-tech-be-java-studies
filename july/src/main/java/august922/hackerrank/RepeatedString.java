package august922.hackerrank;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long countInString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countInString++;
            }
        }

        long countInCutString = 0;
        long lengthOfCutString = n % s.length();
        for (int i = 0; i < lengthOfCutString; i++) {
            if (s.charAt(i) == 'a') {
                countInCutString++;
            }
        }

        return countInString * (n / s.length()) + countInCutString;
    }
}

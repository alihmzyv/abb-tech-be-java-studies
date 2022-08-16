package problems.easy;

public class ValidPalindrom125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^\\da-z]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}

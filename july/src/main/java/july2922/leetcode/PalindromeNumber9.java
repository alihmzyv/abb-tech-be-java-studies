package july2922.leetcode;

public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        return xStr.equals(new StringBuilder(xStr).reverse().toString());
    }
}

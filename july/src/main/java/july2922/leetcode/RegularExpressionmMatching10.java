package july2922.leetcode;

import java.util.regex.Pattern;

public class RegularExpressionmMatching10 {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }
}

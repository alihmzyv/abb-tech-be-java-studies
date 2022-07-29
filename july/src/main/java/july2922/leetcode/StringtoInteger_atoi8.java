package july2922.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringtoInteger_atoi8 {
    public static void main(String[] args) {
        new StringtoInteger_atoi8().myAtoi("21474836460");
    }
    public int myAtoi(String s) {
        int result = 0;
        //Read in and ignore any leading whitespace.
        String stringInput = s.trim();
        //Check if the next character (if not already at the end of the string) is '-' or '+'.
        // Read this character in if it is either.
        // This determines if the final result is negative or positive respectively.
        int sign = 1;
        try {
            if (stringInput.charAt(0) == '-') { // Assume the result is positive if neither is present.
                sign = -1;
            }
        }
        catch (StringIndexOutOfBoundsException exc) {
            result = 0;
        }
        //Read in next the characters until the next non-digit character or the end of the input is reached.
        //The rest of the string is ignored.
        Pattern pattern = Pattern.compile("^[+|-]?[\\d]+");
        Matcher matcher = pattern.matcher(stringInput);
        if (matcher.find()) {
            stringInput = matcher.group();
            try {
                result = Integer.parseInt(stringInput);
            }
            catch (NumberFormatException exc) {
                if (sign > 0) {
                    result = (int) Math.pow(2, 31);
                }
                else if (sign < 0){
                    result = - (int) Math.pow(2, 31) - 1;
                }
            }
        }
        else {
            result = 0;
        }

        return result;
    }
}

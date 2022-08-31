package easy;

import java.util.regex.Pattern;

public class CamelCase {
    public static int camelcase(String s) {
        //no empty strings according to problem statement, thus at least the first lowercase word is present
        //"It is a concatenation of one or more words consisting of English letters."
        return (int) s.chars()
                .filter(Character::isUpperCase)
                .count() + 1; //the lowercase first word
    }
}

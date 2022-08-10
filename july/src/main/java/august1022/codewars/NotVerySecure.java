package august1022.codewars;

import java.util.regex.Pattern;

public class NotVerySecure {
    public static boolean alphanumeric(String s){
        return Pattern.matches("[\\da-zA-Z]+", s);
    }
}

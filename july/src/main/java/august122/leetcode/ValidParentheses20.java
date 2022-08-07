package august122.leetcode;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (bracketIsOpen(ch)) {
                brackets.push(ch);
            }
            if (bracketIsClose(ch)) {
                if (brackets.isEmpty()) { //closed bracket cannot come first
                    return false;
                }

                Character lastBracket = brackets.peek();
                if (!bracketCorresponds(ch, lastBracket)) {
                    return false;
                }
                brackets.pop();
            }
        }

        boolean result = brackets.isEmpty();

        return result;
    }

    public static boolean bracketCorresponds(char closed, char open) {
        String openBrackets = "([{<";
        String closedBrackets = ")]}>";

        return closedBrackets.indexOf(closed) == openBrackets.indexOf(open);
    }

    public static boolean bracketIsOpen(char bracket) {
        String openBrackets = "([{<";
        return openBrackets.contains(String.valueOf(bracket));
    }

    public static boolean bracketIsClose(char bracket) {
        String closedBrackets = ")]}>";
        return closedBrackets.contains(String.valueOf(bracket));
    }
}

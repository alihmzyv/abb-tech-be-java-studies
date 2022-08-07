package august122.leetcode;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        boolean result = true;

        Stack<Character> brackets = new Stack<>();
        String closedBrackets = "([{";
        String openBrackets = ")]}";

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1); //used substring so can be used with String.substring

            if (openBrackets.contains(ch)) {
                brackets.push(s.charAt(i));
            }
            if (closedBrackets.contains(ch)) {
                Character lastBracket;
                try {
                    lastBracket = brackets.peek();
                }
                catch (EmptyStackException exc) { //closed bracket cannot come first
                    result = false;
                    break;
                }
                int indexOfClosedBracket = closedBrackets.indexOf(s.charAt(i));
                Character correspondingOpenBracket = openBrackets.charAt(indexOfClosedBracket);
                if (lastBracket == correspondingOpenBracket) {
                    brackets.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
        }

        return result && brackets.isEmpty();
    }
}

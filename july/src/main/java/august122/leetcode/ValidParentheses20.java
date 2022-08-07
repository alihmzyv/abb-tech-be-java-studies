package august122.leetcode;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();
        String openBrackets = "([{";
        String closedBrackets = ")]}";

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (openBrackets.contains(String.valueOf(ch))) {
                brackets.push(s.charAt(i));
            }
            if (closedBrackets.contains(String.valueOf(ch))) {
                if (brackets.isEmpty()) {
                    brackets.push(ch); //so the stack is not empty, false will be returned
                    break;
                }

                Character lastBracket = brackets.peek();
                int indexOfClosedBracket = closedBrackets.indexOf(ch);
                Character correspondingOpenBracket = openBrackets.charAt(indexOfClosedBracket);
                if (lastBracket == correspondingOpenBracket) {
                    brackets.pop();
                }
                else { //not valid parantheses
                    break;
                }
            }
        }

        boolean result = brackets.isEmpty();

        return result;
    }
}

package august122.leetcode;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        StringBuilder stack = new StringBuilder(); //must be empty in the end
        String openBrackets = "({[";
        String closeBrackets = ")}]";
        char bracket;
        char previousBracket;
        int positionOfClosedBracket; //0 = (), 1 = {}, 2 = []

        for (int i = 0; i < s.length(); i++) {
            bracket = s.charAt(i);

            //if bracket is open: add to the stack, to be removed by corresponding closing bracket
            //if bracket is closed: check if the previous one is corresponding opening bracket:
            //if yes, delete opening bracket, continue
            //if not, invalid parantheses, return false
            if (openBrackets.indexOf(bracket) != -1) { //bracket is open
                stack.append(s.charAt(i));
            }
            else if (stack.length() != 0) { //bracket is closed and there is possibility that the previous one is matching
                previousBracket = stack.charAt(stack.length() - 1);
                positionOfClosedBracket = closeBrackets.indexOf(s.charAt(i));

                if (previousBracket == openBrackets.charAt(positionOfClosedBracket)) {//previous bracket is corresponding open bracket
                    stack.deleteCharAt(stack.length() - 1);
                }
                else {
                    return false;
                }
            }
            else {//String bracket is closed, the length is zero, invalidity of parantheses
                return false;
            }
        }

        return stack.isEmpty(); //stack emptiness assures the correct matches were found (no open brackets left)
    }
}

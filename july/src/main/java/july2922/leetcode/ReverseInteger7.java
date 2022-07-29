package july2922.leetcode;

public class ReverseInteger7 {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        int xReversed;

        //append integer into empty string builder
        if (x < 0) {
            sb.append(- x).append("-");
        }
        else {
            sb.append(x);
        }

        //convert reverse of string builder into integer
        try {
            xReversed = Integer.parseInt(sb.reverse().toString());
        }
        catch (NumberFormatException exc) { //if reversed integer cannot be assigned into int type variable
            xReversed = 0;
        }

        return xReversed;
    }
}

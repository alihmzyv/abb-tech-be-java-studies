package july2922.leetcode;

public class ZigZagConversion6 {
    public String convert(String s, int numRows) {

        if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int firstRowCharsPositionIteration = numRows + Math.abs(numRows - 2); // number of perpendicular chars + number of diagonal chars


        //next rows
        outer:
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j += firstRowCharsPositionIteration) {

                if (s.length() == sb.length()) {//do not iterate for numRows in vain
                    break outer;
                }

                if (i == 0) {
                    sb.append(s.charAt(j));
                    continue;
                }

                //try to append both chars at i distance from the char at j
                if (i != numRows - 1) { //in first and last row char selection, same char is selected twice, thus avoid it
                    try {
                        sb.append(s.charAt(j - i));
                    } catch (StringIndexOutOfBoundsException exc) {}
                }

                try {
                    sb.append(s.charAt(j + i));
                } catch (StringIndexOutOfBoundsException exc) {}

            }
        }

        return sb.toString();
    }
}
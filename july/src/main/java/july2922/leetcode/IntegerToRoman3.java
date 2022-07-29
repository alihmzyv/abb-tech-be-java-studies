package july2922.leetcode;

public class IntegerToRoman3 {
    public String intToRoman(int num) {
        //num <= 3999
        StringBuilder sb = new StringBuilder(); //number in Roman
        int digitPosition = 0;
        int lastDigit; //just not to get error
        int tempNum = num;

        String[][] RomanNumbers = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "M".repeat(2), "M".repeat(3), "M".repeat(4)}
        };

        while (tempNum > 0) {
            lastDigit = tempNum % 10;
            sb.insert(0, RomanNumbers[digitPosition][lastDigit]);
            tempNum /= 10;
            digitPosition++;
        }

        return sb.toString();
    }
}

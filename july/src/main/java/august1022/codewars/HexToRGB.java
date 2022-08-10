package august1022.codewars;

import java.util.*;
import java.util.regex.Pattern;

public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {
        String hexLowerCase = hex.toLowerCase(); //case-insensitive

        if (!Pattern.matches("#[\\da-z]{6}", hexLowerCase)) { //check syntax
            return null;
        }

        //create a map key: hexadecimal character, value: value to be multipled by 16 or 1
        //take each 2 character substring as color code
        //convert into decimal
        //add to the result
        List<Integer> decimalColor = new ArrayList<>(3);
        //create a map key: hexadecimal character, value: value to be multipled by 16 or 1
        SortedMap<Character, Integer> charValuePairs = new TreeMap<>();
        charValuePairs.putAll(Map.of('0', 0, '1', 1, '2', 2, '3', 3,
                '4', 4, '5', 5, '6', 6, '7', 7, '8', 8, '9', 9));
        charValuePairs.putAll(Map.of('a', 10, 'b', 11, 'c', 12, 'd', 13, 'e', 14, 'f', 15));

        //take each 2 character substring as color code
        String color;
        char firstChar;
        char secondChar;
        int decimal;
        for (int i = 1; i <= 5; i += 2) {
            color = hexLowerCase.substring(i, i + 2);
            firstChar = color.charAt(0);
            secondChar = color.charAt(1);
            decimal = charValuePairs.get(firstChar) * 16 + charValuePairs.get(secondChar);
            decimalColor.add(decimal);
        }

        return decimalColor.stream().mapToInt(i->i).toArray();
    }
}

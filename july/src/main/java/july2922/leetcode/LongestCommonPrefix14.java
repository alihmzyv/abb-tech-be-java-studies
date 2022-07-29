package july2922.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        int lengthOfLongestCommonPrefix = 0;
        String[] strings = Arrays.copyOf(strs, strs.length); //not to alter the original array

        //* For a prefix to be common among all the elements of strs array, it can have the length of the smallest string
        // at maximum.
        // * Thus iterate through the smallest string element of strs array

        //find the smallest String element of strs array
        Arrays.sort(strs, Comparator.comparingInt(String::length)); //sort array based on length
        String smallestStr = strs[0];

        //iterate through the elements of the smallestStr
        for (int i = 0; i <= smallestStr.length(); i++) {
            if (!substringIsCommonPrefixForAllElements(smallestStr.substring(0, i), strings)) {
                break;
            }
            lengthOfLongestCommonPrefix = i;
        }

        return smallestStr.substring(0, lengthOfLongestCommonPrefix);
    }

    public static boolean substringIsCommonPrefixForAllElements(String str, String[] arr) {
        //check if string is common prefix among all String elements of arr
        boolean isCommon = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(str) != 0) {
                isCommon = false;
                break;
            }
        }

        return isCommon;
    }
}

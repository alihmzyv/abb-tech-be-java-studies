package july2922.leetcode;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb; //substrings
        int lengthOfLongestSubstring = 0; //return

        for (int i = 0; i < s.length(); i++) {
            //take the substring starting from i
            sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (sb.toString().indexOf(s.charAt(j)) != -1) { //if repeat of index is found
                    break;
                }
                sb.append(s.charAt(j)); //otherwise append the char
            }

            if (sb.length() > lengthOfLongestSubstring) {
                lengthOfLongestSubstring = sb.length();
            }
        }

        return lengthOfLongestSubstring;
    }
}

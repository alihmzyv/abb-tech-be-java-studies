package problems.easy;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}

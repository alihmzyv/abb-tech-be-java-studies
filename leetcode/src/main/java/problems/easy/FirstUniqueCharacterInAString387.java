package problems.easy;

public class FirstUniqueCharacterInAString387 {
    public int firstUniqChar(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (isUnique(i, s)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isUnique(int index, String s) {
        //checks if character at index is unique
        char ch = s.charAt(index);
        return s.substring(0, index).indexOf(ch) == -1 &&
                s.substring(index + 1).indexOf(ch) == -1;
    }
}

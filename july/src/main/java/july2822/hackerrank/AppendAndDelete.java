package july2822.hackerrank;

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        boolean can = false;

        //count the minimum number of operations required
        int countMinOperations;
        int indexMatchFailed = s.length(); //s.length() - 1: when s is a substring of t
        for (int i = 0; i < s.length(); i++) {
            try {
                if (s.charAt(i) != t.charAt(i)) {
                    indexMatchFailed = i;
                    break;
                }
            }
            catch (StringIndexOutOfBoundsException exc) {
                break;
            }
        }
        countMinOperations = (s.length() - indexMatchFailed) + (t.length() - indexMatchFailed); //delete + append


        if (countMinOperations < k) {
            if ((k - countMinOperations) % 2 == 0) { //we can do delete and append couple as many as we can
                can = true;
            }
            else {
                if ((k - countMinOperations) > (indexMatchFailed) * 2) {
                    can = true;
                }
            }
        }
        else {
            can = true;
        }

        return can ? "Yes" : "No";
    }
}

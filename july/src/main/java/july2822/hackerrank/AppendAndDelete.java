package july2822.hackerrank;

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        boolean can = false; //if number of minimum operations required is higher than the required

        //* count the minimum number of operations required
        int countMinOperations;
        int indexMatchFailed = s.length(); //when s is a substring of t or vice versa
        for (int i = 0; i < s.length(); i++) {
            try {
                if (s.charAt(i) != t.charAt(i)) { //if never true -> s is a substring of t
                    indexMatchFailed = i;
                    break;
                }
            }
            catch (StringIndexOutOfBoundsException exc) { //t is a substring of s
                break;
            }
        }
        countMinOperations = (s.length() - indexMatchFailed) + (t.length() - indexMatchFailed);
        // minimum operations = delete non-matching part + add the substring of t


        if (countMinOperations < k) { //if number of minimum operations required is less than the required
            if ((k - countMinOperations) % 2 == 0) { //we can do delete and append the last character till the required
                can = true;
            }
            else { //we cant
                if (indexMatchFailed == s.length()) { //in this case, indexMathField = s.length()
                    if ((k - countMinOperations) > (indexMatchFailed) * 2) {
                        can = true;
                    }
                }
                else if ((k - countMinOperations) > (indexMatchFailed + 1) * 2) { //there is chance to delete the whole s, do deletes on "", then append the whole s again
                    can = true;
                }
            }
        }
        else if (countMinOperations == k) { //if number of minimum operations is equal to the required
            can = true;
        }

        return can ? "Yes" : "No";
    }
}

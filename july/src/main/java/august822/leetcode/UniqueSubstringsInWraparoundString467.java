package august822.leetcode;

import java.util.*;

public class UniqueSubstringsInWraparoundString467 {
    public int findSubstringInWraproundString(String p) {
        int count = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; //to be wrapped


        //wrap alphabet adequately according to the length of string
        String wraparoundString = alphabet.repeat(p.length()/alphabet.length() + 2);


        Set<String> uniqueSubstrings = new HashSet<>();
        //add unique substrings
        for (int i = 0; i < p.length(); i++) {
            for (int j = i + 1; j < p.length() + 1; j++) {
                uniqueSubstrings.add(p.substring(i, j));
            }
        }

        //iterate through the unique substrings and count the ones that are contained in wraparound string
        Iterator<String> uniqueSubstringIterator = uniqueSubstrings.iterator();

        for (; uniqueSubstringIterator.hasNext(); ) {
            if (wraparoundString.contains(uniqueSubstringIterator.next())) {
                count++;
            }
        }

        return count;
    }
}

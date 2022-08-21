package problems.easy;

import java.util.*;
import java.util.stream.IntStream;

public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> isoMap = new HashMap<>();
        return IntStream.range(0, s.length())
                .noneMatch(i -> { //to short-circuit
                    Character found = isoMap.get(s.charAt(i));
                    if (found == null) { //no key matching
                        if (!isoMap.values().contains(t.charAt(i))) { //put and continue only if value not in map
                            isoMap.put(s.charAt(i), t.charAt(i));
                            return false;
                        }
                        return true; //if there was key, value pair whose only pair is matching now
                    }
                    else {
                        return t.charAt(i) != found;
                    }
                });
    }
}
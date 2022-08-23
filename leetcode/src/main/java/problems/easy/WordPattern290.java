package problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> patternMap = new HashMap<>();
        return IntStream.range(0, pattern.length())
                .allMatch(i -> {
                    char letter = pattern.charAt(i);
                    String word = words[i];
                    if (patternMap.containsKey(letter)) return patternMap.get(letter).equals(word);
                    if (patternMap.containsValue(word)) return false;
                    patternMap.put(letter, word);
                    return true;
                });

    }
}

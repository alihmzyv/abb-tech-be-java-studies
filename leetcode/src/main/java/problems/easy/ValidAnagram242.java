package problems.easy;

import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Long> characterCountMap1 = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> characterCountMap2 = t.chars()
                        .mapToObj(i -> (char) i)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return characterCountMap1.equals(characterCountMap2);

    }
}

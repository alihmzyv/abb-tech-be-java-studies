package july2822.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        return p.stream()
                .sorted()
                .map(i -> p.indexOf(i) + 1)
                .map(i -> p.indexOf(i) + 1)
                .collect(Collectors.toList());
    }

}

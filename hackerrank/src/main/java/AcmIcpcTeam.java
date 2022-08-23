import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AcmIcpcTeam {
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        //convert topic to map: index -> topics list (1 -> 1, 2, 4, 2 -> 1, 2, 5 etc.)
        //create map: number of topics known -> number of teams that know those amount
        //for all permutations of 2 persons -> increase the key of map by 1:(set of topics lists).size()
        List<List<Integer>> topicsKnown = topic.stream()
                .map(topics -> IntStream.range(0, topics.length())
                        .filter(i -> Integer.parseInt(String.valueOf(topics.charAt(i))) == 1)
                        .map(i -> i + 1)
                        .boxed()
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        NavigableMap<Integer, Long> permutations = IntStream.range(0, topicsKnown.size() - 1)
                .flatMap(i -> IntStream.range(i + 1, topicsKnown.size()).mapToObj(j ->
                        Stream.concat(topicsKnown.get(i).stream(), topicsKnown.get(j).stream())
                                .distinct().count()).mapToInt(Long::intValue))
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap<Integer, Long>::new, Collectors.counting()));
        Map.Entry<Integer, Long> maximumResult = permutations.lastEntry();
        return List.of(maximumResult.getKey(), maximumResult.getValue().intValue());
    }
}

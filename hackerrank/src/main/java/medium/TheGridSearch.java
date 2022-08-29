package medium;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheGridSearch {
    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        //IntStream - from index = 0 till index = G.size() - p.size() (inclusive)
        //map each index to List of strings from index till index + p.size() = Stream of List of Strings
        //map each list to IntStream.range(0, G.get(0).length - p.get(0).length).mapToObj(i -> list.stream.map(s -> s.substring(i, i + cols))
        int rowsOfPattern = P.size();
        int colsOfPattern = P.get(0).length();
        int colsOfGrid = G.get(0).length();
        return IntStream.rangeClosed(0, G.size() - rowsOfPattern)
                .parallel()
                .mapToObj(i -> G.subList(i, i + rowsOfPattern))
                .flatMap(list -> IntStream.rangeClosed(0, colsOfGrid - colsOfPattern)
                        .mapToObj(i -> list.stream()
                                .parallel()
                                .map(s -> s.substring(i, i + colsOfPattern))
                                .collect(Collectors.toList())))
                .anyMatch(list -> list.equals(P)) ? "YES" : "NO";
    }
}

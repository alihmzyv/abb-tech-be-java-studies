import java.util.List;
import java.util.stream.IntStream;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        //find the indexes
        if (a.stream().distinct().count() == a.size()) {
            return - 1;
        }
         return IntStream.range(0, a.size() - 1)
                    .filter(i -> IntStream.range(i + 1, a.size())
                            .unordered().parallel()
                            .filter(j -> a.get(i) == a.get(j))
                            .findAny().isPresent())
                    .map(i -> IntStream.range(i + 1, a.size())
                            .unordered().parallel()
                            .filter(j -> a.get(i) == a.get(j))
                            .findAny().getAsInt() - i)
                    .min()
                 .orElse(-1);
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class ServiceLane {
    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        // Write your code here
        return cases.stream()
                .map(pair -> width.subList(pair.get(0), pair.get(1) + 1).stream()
                        .min(Integer::compare)
                        .get())
                .collect(Collectors.toList());
    }

}

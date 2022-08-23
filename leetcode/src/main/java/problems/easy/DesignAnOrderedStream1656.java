package problems.easy;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesignAnOrderedStream1656 {

}

class OrderedStream {

    private int maxID;
    private Map<Integer, String> mapIDkeyValue;
    static private int greatestID = 0;

    public OrderedStream(int n) {
        this.maxID = n;
        mapIDkeyValue = new TreeMap<>();
    }

    public List<String> insert(int idKey, String value) {
        if (idKey > greatestID) {
            greatestID = idKey;
        }
        mapIDkeyValue.put(idKey, value);

        if (mapIDkeyValue.keySet().containsAll(IntStream.range(1, idKey).boxed().collect(Collectors.toSet()))) {
            //if map contains the keys from 1 to the id inserted last
            return IntStream.rangeClosed(idKey, greatestID)
                    .takeWhile(i -> mapIDkeyValue.containsKey(i))
                    .mapToObj(i -> mapIDkeyValue.get(i))
                    .toList();
        }
        return List.of(); //if there is no continuity from 1 to idKey
    }
}
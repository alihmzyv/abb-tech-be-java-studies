package problems.easy;

import java.util.*;
import java.util.stream.Stream;

public class NumberOfRecentCalls933 {
}


class RecentCounter {

    private Set<Integer> requests;

    public RecentCounter() {
        requests = new TreeSet<>(Collections.reverseOrder());
    }

    public int ping(int t) {
        requests.add(t);
        return (int) requests.stream().takeWhile(time -> time >= t - 3000)
                .count();
    }
}
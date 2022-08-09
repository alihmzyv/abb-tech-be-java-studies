package august922.hackerrank;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticks = new LinkedList<>(arr);
        //find the minimum of sticks
        //subtract the minimum from each of sticks till there is no element different than 0
        //save the number of element of sticks different than 0 before each cut



        //subtract the minimum from each of sticks till there is no element different than 0
        //save the number of element of sticks different than 0 before each cut
        Set<Integer> numberOfSticksAtEachIteration = new TreeSet<>(Collections.reverseOrder());
        while (sticks.size() != 0) {
            numberOfSticksAtEachIteration.add(sticks.size());

            //find the minimum of sticks
            Collections.sort(sticks);
            int leastOfSticks = sticks.get(0);

            //subtract the minimum from each of sticks
            sticks.replaceAll(stick -> stick -= leastOfSticks);

            //remove the elements that are less than or equal to zero
            for (int i = 0; i < sticks.size(); i++) {
                if (sticks.get(i) <= 0) {
                    sticks.removeAll(Arrays.asList(sticks.get(i)));
                }
            }
        }

        return new ArrayList<>(numberOfSticksAtEachIteration);
    }
}

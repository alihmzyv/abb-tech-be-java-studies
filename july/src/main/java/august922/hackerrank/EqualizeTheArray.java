package august922.hackerrank;

import java.util.*;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        Collections.sort(arr);
        SortedSet<Integer> sortedSetOfArr = new TreeSet<>(arr); //unique numbers sorted
        SortedSet<Integer> sortedSetOfNumberOfEqualIntegers = new TreeSet<>(Collections.reverseOrder()); //number of occurrences sorted



        //count occurrence of numbers
        Iterator<Integer> integerIterator = sortedSetOfArr.iterator(); //iterate through unique numbers
        while (integerIterator.hasNext()) {
            int number = integerIterator.next();
            int firstIndex = arr.indexOf(number);
            int lastIndex = arr.lastIndexOf(number);
            sortedSetOfNumberOfEqualIntegers.add(lastIndex - firstIndex + 1);
        }

        return arr.size() - sortedSetOfNumberOfEqualIntegers.first();
    }
}

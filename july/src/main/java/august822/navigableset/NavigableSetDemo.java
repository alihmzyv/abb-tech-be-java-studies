package august822.navigableset;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<String> stringNavigableSet = new TreeSet<>(Arrays.asList("A", "C", "B", "D", "F"));
        System.out.println(stringNavigableSet.floor("C"));
    }
}

package august822.collectionsClass;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Box> integerList = Arrays.asList(new Box(2, "e"), new Box(4, "d"), new Box(1, "c"));
        Comparator<Box> compByName = new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Queue<Integer> integerQueue = new PriorityQueue<>();
//        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(Collections.binarySearch(integerList, new Box(1, "b")));
        System.out.println(integerList);
    }
}

class Box implements Comparable<Box>{
    String name;
    int a;

    public Box(int a, String name) {
        this.name = name;
        this.a = a;
    }

    @Override
    public int compareTo(Box o) {
        return a - o.a;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, a: %d", name, a);
    }
}

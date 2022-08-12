package august1222.danit;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 5));
        ListIterator<Integer> integerIterator = integerList.listIterator(4);
        while (integerIterator.hasPrevious()) {
            System.out.println(integerIterator.previous());
            integerIterator.remove();
        }
        System.out.println(integerList);
    }
}

package august1922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4));
        listList.add(list1);
        listList.add(list2);

        listList.stream()
                .map(list -> list.removeIf(i -> i > 2));
        System.out.println(listList);
    }
}

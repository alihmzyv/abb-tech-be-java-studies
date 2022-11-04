package november42022.tasksgiven.solution19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 0, -5, 10, 100};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        List<Integer> list = intArrToList(arr);
        Collections.reverse(list);
        return listToIntArr(list);
    }

    public static List<Integer> intArrToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
    }

    public static int[] listToIntArr(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }
}

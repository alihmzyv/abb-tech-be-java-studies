package july2822.hackerrank;

import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int[] arr = rotateArrayRight(a.stream().mapToInt(i->i).toArray(), k);
        Integer[] result = new Integer[queries.toArray().length];

        for (int i = 0; i < queries.toArray().length; i++) {
            result[i] = arr[queries.get(i)];
        }

        return Arrays.asList(result);
    }

    public static int[] rotateArrayRight(int[] arr, int k) {
        int temp;

        for (int j = 0; j < k; j++) {
            temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i >0; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
        }

        return arr;
    }
}

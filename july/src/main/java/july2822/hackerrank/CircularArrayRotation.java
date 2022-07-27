package july2822.hackerrank;

import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int[] arr = rotateArrayRight(a.stream().mapToInt(i->i).toArray(), k);
        int queriesLength = queries.toArray().length;
        Integer[] result = new Integer[queriesLength];

        for (int i = 0; i < queriesLength; i++) {
            result[i] = arr[queries.get(i)];
        }

        return Arrays.asList(result);
    }

    public static int[] rotateArrayRight(int[] arr, int k) {
        int temp;

        while(k > 0){
            temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i >0; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
            k--;
        }

        return arr;
    }
}

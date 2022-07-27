package july2722;

import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(Arrays.asList(new Integer[]{1, 2, 3}), 2, Arrays.asList(new Integer[]{0, 1, 2})).toArray()));
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int[] arr = a.stream().mapToInt(i->i).toArray();
        int[] queriesArr = queries.stream().mapToInt(i->i).toArray();
        Integer[] arrResult = new Integer[queriesArr.length];
        int[] arrRotated = rightRotateArr(arr, k);


        for (int i = 0; i < queriesArr.length; i++) {
            arrResult[i] = arrRotated[queriesArr[i]];
        }

        return Arrays.asList(arrResult);
    }

    public static int[] rightRotateArr(int[] arr, int k) {
        int[] arrRotated;

        for(int j = k; j > 0; j--) {

            arrRotated = new int[arr.length];
            arrRotated[0] = arr[arr.length - 1];


            for (int i = 1; i < arr.length; i++) {
                arrRotated[i] = arr[i - 1];
            }

            arr = arrRotated;
        }

        return arr;
    }
}

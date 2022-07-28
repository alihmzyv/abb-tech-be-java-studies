package july2822.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        int[] pArr = p.stream().mapToInt(i->i).toArray();
        Integer[] y = new Integer[pArr.length]; //to be returned

        //copy, sort the new array to find max int
        int[] pArrBackup = Arrays.copyOf(pArr, pArr.length);
        Arrays.sort(pArrBackup);

        for (int i = 1; i <= pArrBackup[pArrBackup.length -1]; i++) {
            y[i - 1] = findIndexOf(pArr, findIndexOf(pArr, i));
        }

        return Arrays.asList(y);
    }

    public static int findIndexOf(int[] arr, int el) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                index = i;
                break;
            }
        }

        return ++index;
    }
}

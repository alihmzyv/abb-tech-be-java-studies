package august222.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointstoOrigin973 {
    class SortbyDistanceFromOrigin implements Comparator<int[]> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(int[] a, int[] b)
        {
            return Double.compare(findDistanceFromOrigin(a), findDistanceFromOrigin(b));
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        //sort points based on their distance from origin
         Arrays.sort(points, new SortbyDistanceFromOrigin());

         //return the subArray [0, k-1]
         return Arrays.copyOfRange(points, 0, k);
    }

    public static double findDistanceFromOrigin(int[] coordinates) {
        // *returns distance from point
        // *point = {x, y}
        // *coordinates {x, y}
        int x1 = coordinates[0];
        int y1 = coordinates[1];

        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    }
}

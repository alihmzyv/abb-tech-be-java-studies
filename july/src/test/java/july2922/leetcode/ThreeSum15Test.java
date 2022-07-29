package july2922.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSum15Test {

    @Test
    void threeSum() {
        ArrayList<Integer> arr1 = new ArrayList<>(3);
        ArrayList<Integer> arr2 = new ArrayList<>(3);
        ArrayList<List<Integer>> arr3 = new ArrayList<>();
        arr1.add(-1);
        arr1.add(-1);
        arr1.add(2);
        arr2.add(-1);
        arr2.add(0);
        arr2.add(1);
        arr3.add(arr1);
        arr3.add(arr2);
        assertEquals(arr3, new ThreeSum15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
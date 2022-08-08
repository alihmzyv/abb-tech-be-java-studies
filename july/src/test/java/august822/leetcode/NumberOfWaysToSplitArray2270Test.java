package august822.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToSplitArray2270Test {

    @Test
    void test1() {
        assertEquals(2, new NumberOfWaysToSplitArray2270().waysToSplitArray(new int[]{10,4,-8,7}));
    }

    @Test
    void test2() {
        assertEquals(2, new NumberOfWaysToSplitArray2270().waysToSplitArray(new int[]{2, 3, 1, 0}));
    }
}
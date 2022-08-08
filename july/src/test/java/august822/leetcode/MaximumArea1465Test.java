package august822.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumArea1465Test {

    @Test
    void maxArea() {
        assertEquals(81, new MaximumArea1465().maxArea(1_000_000_000, 1_000_000_000, new int[]{2}, new int[]{2}));
    }
}
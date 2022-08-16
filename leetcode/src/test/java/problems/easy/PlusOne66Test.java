package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOne66Test {

    @Test
    void plusOne() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, new PlusOne66().plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{1, 0}, new PlusOne66().plusOne(new int[]{9}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, new PlusOne66().plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 1}, new PlusOne66().plusOne(new int[]{1, 0}));
        assertArrayEquals(new int[]{1}, new PlusOne66().plusOne(new int[]{0}));
        assertArrayEquals(new int[]{2}, new PlusOne66().plusOne(new int[]{1}));
        assertArrayEquals(new int[]{3, 6, 0, 0, 0}, new PlusOne66().plusOne(new int[]{3, 5, 9, 9, 9}));
    }
}
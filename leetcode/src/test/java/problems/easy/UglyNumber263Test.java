package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumber263Test {

    UglyNumber263 sample = new UglyNumber263();

    @Test
    void isUglyTest1() {
        assertTrue(sample.isUgly(6));
    }

    @Test
    void isUglyTest2() {
        assertTrue(sample.isUgly(1));
    }

    @Test
    void isUglyTest3() {
        assertFalse(sample.isUgly(14));
    }

    @Test
    void isUglyTest4() {
        assertFalse(sample.isUgly(-2147483648));
    }

    @Test
    void isUglyTest5() {
        assertFalse(sample.isUgly(905391974));
    }
}
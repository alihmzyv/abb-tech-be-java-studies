package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sqrt69Test {

    @Test
    void mySqrt() {
        assertEquals(2, new Sqrt69().mySqrt(4));
    }

    @Test
    void mySqrtTest2() {
        assertEquals(2, new Sqrt69().mySqrt(7));
    }

    @Test
    void mySqrtTest3() {
        assertEquals(1, new Sqrt69().mySqrt(1));
    }

    @Test
    void mySqrtTest4() {
        assertEquals(46340, new Sqrt69().mySqrt(2147395600));
    }
}
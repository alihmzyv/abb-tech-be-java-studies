package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumber268Test {
    MissingNumber268 sample = new MissingNumber268();

    @Test
    void missingNumberTest1() {
        assertEquals(2, sample.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void missingNumberTest2() {
        assertEquals(2, sample.missingNumber(new int[]{0, 1}));
    }

    @Test
    void missingNumberTest3() {
        assertEquals(8, sample.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
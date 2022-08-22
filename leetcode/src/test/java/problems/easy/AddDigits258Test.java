package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigits258Test {

    AddDigits258 addDigits258 = new AddDigits258();

    @Test
    void addDigitsTest1() {
        assertEquals(2, addDigits258.addDigits(38));
    }

    @Test
    void addDigitsTest2() {
        assertEquals(0, addDigits258.addDigits(0));
    }

    @Test
    void addDigitsTest3() {
        assertEquals(1, addDigits258.addDigits(1));
    }
}
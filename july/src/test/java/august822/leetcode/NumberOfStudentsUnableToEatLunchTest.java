package august822.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStudentsUnableToEatLunchTest {

    @Test
    void countStudents() {
        assertEquals(0, new NumberOfStudentsUnableToEatLunch().countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }
}
package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangle118Test {

    @Test
    void generateTest1() {
        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]", new PascalsTriangle118().generate(5).toString());
    }
}
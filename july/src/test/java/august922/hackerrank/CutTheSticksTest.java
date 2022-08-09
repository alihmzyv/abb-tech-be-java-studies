package august922.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {

    @Test
    void cutTheSticks() {
        assertEquals(Arrays.asList(8, 7, 6, 4, 3, 2, 1), CutTheSticks.cutTheSticks(Arrays.asList(1, 13, 3, 8, 14, 9, 4, 4)));
    }
}
package july2622.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void countingValleysTest() {
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }
}
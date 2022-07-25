package july2522.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheRecordsTest {

    @Test
    void breakingRecords() {
        assertEquals(Arrays.stream(new Integer[]{4, 0}).toList(), BreakingTheRecords.breakingRecords(Arrays.asList(new Integer[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})));
    }
}
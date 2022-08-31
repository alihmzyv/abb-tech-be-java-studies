package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCounterTest {

    @Test
    void strangeCounterTest1() {
        assertEquals(6, StrangeCounter.strangeCounter(4));
    }
}
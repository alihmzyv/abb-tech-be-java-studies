package august922.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    @Test
    void repeatedString() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
    }
}
package july2922.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversion6Test {
    @Test
    void zigZagConvert() {
        ZigZagConversion6 zz = new ZigZagConversion6();
        assertEquals("ABCED", zz.convert("ABCDE", 4));
    }
}
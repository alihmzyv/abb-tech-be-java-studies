package july2922.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringtoInteger_atoi8Test {

    @Test
    void stringtointTest1() {
        StringtoInteger_atoi8 x = new StringtoInteger_atoi8();
        assertEquals(0, x.myAtoi("words 21474836460"));
    }

}
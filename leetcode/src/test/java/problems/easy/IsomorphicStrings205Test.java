package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStrings205Test {

    @Test
    void isIsomorphicTest1() {
        assertTrue(new IsomorphicStrings205().isIsomorphic("egg", "add"));
    }

    @Test
    void isIsomorphicTest2() {
        assertFalse(new IsomorphicStrings205().isIsomorphic("badc", "baba"));
    }

}
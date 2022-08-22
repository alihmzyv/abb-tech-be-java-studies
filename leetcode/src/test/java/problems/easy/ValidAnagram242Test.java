package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram242Test {

    ValidAnagram242 sample = new ValidAnagram242();

    @Test
    void isAnagramTest1() {
        assertTrue(sample.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagramTest2() {
        assertFalse(sample.isAnagram("rat", "car"));
    }

}
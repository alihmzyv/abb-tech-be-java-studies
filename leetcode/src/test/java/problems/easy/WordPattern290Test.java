package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPattern290Test {

    WordPattern290 sample = new WordPattern290();

    @Test
    void wordPatternTest1() {
        assertTrue(sample.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void wordPatternTest2() {
        assertFalse(sample.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void wordPatternTest3() {
        assertFalse(sample.wordPattern("aaaa", "dog cat cat dog"));
    }
}
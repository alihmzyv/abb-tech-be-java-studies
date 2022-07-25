package july2522.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    void pageCountTest() {
        assertEquals(1, DrawingBook.pageCount(7, 4));
    }
}
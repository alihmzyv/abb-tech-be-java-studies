package august922.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PaginationHelperTest {
    PaginationHelper<Character> paginationHelperTest1 = new PaginationHelper<>(Arrays.asList('a', 'b', 'd', 'd', 'c'), 3);
    @Test
    void itemCountTest1() {
        assertEquals(5, paginationHelperTest1.itemCount());
    }

    @Test
    void pageCountTest1() {
        assertEquals(2, paginationHelperTest1.pageCount());
    }

    @Test
    void pageItemCountTest1() {
        assertEquals(3, paginationHelperTest1.pageItemCount(0));
    }

    @Test
    void pageItemCountTest2() {
        assertEquals(2, paginationHelperTest1.pageItemCount(1));
    }

    @Test
    void pageIndex() {
        assertEquals(1, paginationHelperTest1.pageIndex(4));
    }

    PaginationHelper<Character> paginationHelperTest2 = new PaginationHelper<>(Arrays.asList('a', 'b', 'd', 'd'), 4);
    @Test
    void itemCountTest2() {
        assertEquals(4, paginationHelperTest2.itemCount());
    }

    @Test
    void pageCountTest2() {
        assertEquals(1, paginationHelperTest2.pageCount());
    }

    @Test
    void pageItemCountTest3() {
        assertEquals(-1, paginationHelperTest2.pageItemCount(1));
    }

    @Test
    void pageItemCountTest4() {
        assertEquals(-1, paginationHelperTest2.pageItemCount(2));
    }

    @Test
    void pageIndexTest2() {
        assertEquals(0, paginationHelperTest2.pageIndex(3));
    }
}
package august1222.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeatersTest {

    @Test
    void findRadius() {
        assertEquals(1, new Heaters().findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
    }

    @Test
    void findRadiusTest2() {
        assertEquals(3, new Heaters().findRadius(new int[]{1, 5}, new int[]{2}));
    }

    @Test
    void findRadiusTest3() {
        assertEquals(0, );
    }

}
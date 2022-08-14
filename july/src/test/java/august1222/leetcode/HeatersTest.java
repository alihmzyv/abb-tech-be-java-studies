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
        assertEquals(0, new Heaters().findRadius(new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923},
        new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612}));
    }

}
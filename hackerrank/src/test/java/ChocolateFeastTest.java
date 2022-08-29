import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateFeastTest {

    @Test
    void chocolateFeastTest1() {
        assertEquals(6, ChocolateFeast.chocolateFeast(10, 2, 5));
    }

    @Test
    void chocolateFeastTest2() {
        assertEquals(3, ChocolateFeast.chocolateFeast(12, 4, 4));
    }

    @Test
    void chocolateFeastTest3() {
        assertEquals(5, ChocolateFeast.chocolateFeast(6, 2, 2));
    }
}
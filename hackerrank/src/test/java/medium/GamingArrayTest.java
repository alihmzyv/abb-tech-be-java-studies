package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GamingArrayTest {

    @Test
    void gamingArrayTest1() {
        assertEquals("ANDY", GamingArray.gamingArray(List.of(5, 2, 6, 3, 4)));
    }

    @Test
    void gamingArrayTest2() {
        assertEquals("BOB", GamingArray.gamingArray(List.of(3, 1)));
    }

    @Test
    void gamingArrayTest3() {
        assertEquals("BOB", GamingArray.gamingArray(List.of(1, 3, 5, 7, 9)));
    }

    @Test
    void gamingArrayTest4() {
        assertEquals("ANDY", GamingArray.gamingArray(List.of(7, 4, 6, 5, 9)));
    }

}
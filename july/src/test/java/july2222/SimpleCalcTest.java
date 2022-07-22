package july2222;

import july2222.junit.SimpleCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {


    @Test
    void add() {
        assertEquals(4, SimpleCalc.add(2, 2));
    }

    @Test
    void add2() {
        assertEquals(0, SimpleCalc.add(0, 1));
    }
}
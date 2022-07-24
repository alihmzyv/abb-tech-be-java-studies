package july2422.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    @Test
    public void test2() {
        List<Integer> x = List.of(2, 3, 8);
        List<Integer> y = List.of(24, 74);

        assertEquals(1,BetweenTwoSets.getTotalX(x, y));
    }

}
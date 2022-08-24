import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueensAttackIITest {

    @Test
    void queensAttackTest1() {
        assertEquals(10, QueensAttackII.queensAttack(5, 3, 4, 3, List.of(List.of(5, 5),
                List.of(4, 2), List.of(2, 3))));
    }
}
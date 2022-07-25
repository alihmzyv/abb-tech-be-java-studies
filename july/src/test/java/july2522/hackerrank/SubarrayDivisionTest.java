package july2522.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayDivisionTest {

    @Test
    void birthdayTest() {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 2);
        assertEquals(2, SubarrayDivision.birthday(list, 3, 2));
    }
}
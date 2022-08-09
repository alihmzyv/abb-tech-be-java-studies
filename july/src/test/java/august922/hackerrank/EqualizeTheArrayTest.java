package august922.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EqualizeTheArrayTest {

    @Test
    void equalizeArrayTest1() {
        List<Integer> testList = Arrays.asList(3, 3, 2, 1, 3);
        assertEquals(2, EqualizeTheArray.equalizeArray(testList));
    }

    @Test
    void equalizeArrayTest2() {
        List<Integer> testList2 = Arrays.asList(1, 2, 2, 3);
        assertEquals(2, EqualizeTheArray.equalizeArray(testList2));
    }
}
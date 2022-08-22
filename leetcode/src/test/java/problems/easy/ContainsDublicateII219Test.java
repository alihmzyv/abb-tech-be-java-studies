package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDublicateII219Test {

    @Test
    void containsNearbyDuplicateTest1() {
        assertTrue(new ContainsDublicateII219().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void containsNearbyDuplicateTest2() {
        assertTrue(new ContainsDublicateII219().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    void containsNearbyDuplicateTest3() {
        assertFalse(new ContainsDublicateII219().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
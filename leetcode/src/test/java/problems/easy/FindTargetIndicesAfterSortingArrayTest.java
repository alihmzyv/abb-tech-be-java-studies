package problems.easy;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    void targetIndices() {
        assertEquals(Arrays.asList(1, 2), new FindTargetIndicesAfterSortingArray2089().targetIndices(new int[]{1,2,5,2,3}, 2));
    }
}
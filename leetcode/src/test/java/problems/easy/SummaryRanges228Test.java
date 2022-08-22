package problems.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRanges228Test {

    SummaryRanges228 sample = new SummaryRanges228();

    @Test
    void summaryRangesTest1() {
        assertEquals(List.of("0->2", "4->5", "7"), sample.summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    @Test
    void summaryRangesTest2() {
        assertEquals(List.of("0", "2->4", "6", "8->9"), sample.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    @Test
    void summaryRangesTest3() {
        assertEquals(List.of("5", "8", "10->13", "15"), sample.summaryRanges(new int[]{5,8,10,11,12,13,15}));
    }

}
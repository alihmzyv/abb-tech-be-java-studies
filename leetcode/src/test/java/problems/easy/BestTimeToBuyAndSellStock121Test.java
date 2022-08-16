package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock121Test {

    @Test
    void maxProfitTest1() {
        assertEquals(5, new BestTimeToBuyAndSellStock121().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfitTest2() {
        assertEquals(0, new BestTimeToBuyAndSellStock121().maxProfit(new int[]{7,6,4,3,1}));
    }
}
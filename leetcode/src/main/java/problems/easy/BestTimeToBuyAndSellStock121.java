package problems.easy;

import java.util.*;
import java.util.stream.Collectors;

public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int[] buyablePrices = Arrays.copyOfRange(prices, i + 1, prices.length);
            Arrays.sort(buyablePrices);
            int possibleProfit = -prices[i] + buyablePrices[buyablePrices.length - 1];
            if (possibleProfit > profit) {
                profit = possibleProfit;
            }
        }

        return profit;
    }
}

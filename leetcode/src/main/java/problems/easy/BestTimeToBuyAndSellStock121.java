package problems.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        List<Integer> pricesList = Arrays.stream(prices).boxed().collect(Collectors.toList());
        return IntStream.range(0, prices.length - 1)
                .map(i ->
                        -pricesList.get(i) + pricesList.subList(i + 1, pricesList.size()).stream().max(Comparator.comparingInt(a -> a)).get())
                .filter(profit -> profit > 0)
                .max()
                .orElse(0);
    }
}

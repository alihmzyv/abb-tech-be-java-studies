import java.util.stream.IntStream;

public class HallowenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        //start with p, decrease by d till equals m, continue with m
        //whenever the sum exceeds the budget, break and return number
        if (s < p) {
            return 0;
        }
        int count1 = (int) IntStream.iterate(p, price -> price > m, price -> price - d)
                .count(); //till price falls to m
        int prices1 = IntStream.iterate(p, price -> price > m, price -> price - d)
                .sum(); //prices till price falls to m
        int count2 = (s - prices1) / m; //count games that can be bought with price m
        return count2 + count1;
    }
}

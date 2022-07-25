package july2522.hackerrank;

import java.util.List;
import java.util.stream.IntStream;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int[] socks = ar.stream().mapToInt(i->i).toArray();
        int[] colors = IntStream.of(socks).distinct().toArray();

        int numberOfSocksOfColor;
        int countPairs = 0;

        for (int color: colors) {
            numberOfSocksOfColor = 0;
            for (int sock: socks) {
                if (color == sock) {
                    numberOfSocksOfColor++;
                }
            }

            countPairs+=numberOfSocksOfColor / 2;
        }

        return countPairs;
    }
}

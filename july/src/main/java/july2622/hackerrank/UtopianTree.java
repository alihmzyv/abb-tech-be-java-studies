package july2622.hackerrank;

import java.util.stream.IntStream;

public class UtopianTree {
    public static int utopianTree(int n) {
        int[] height = {1}; //initially 1

        IntStream.rangeClosed(1, n)
                .forEach(cycle -> {
                    if (cycle % 2 == 0) {
                        height[0]++;
                    }
                    else {
                        height[0] *= 2;
                    }
                });

        return height[0];
    }
}

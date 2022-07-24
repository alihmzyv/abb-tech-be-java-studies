package july2422.hackerrank;

import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;
        int locFruit;


        //count apples
        for (int distance: apples) {
            locFruit = a + distance;
            if (locFruit>=s && locFruit <= t) {
                countApples++;
            }
        }

        //count oranges
        for (int distance: oranges) {
            locFruit = b + distance;
            if (locFruit>=s && locFruit <= t) {
                countOranges++;
            }
        }

        System.out.printf("%d\n%d\n", countApples, countOranges);
    }
}

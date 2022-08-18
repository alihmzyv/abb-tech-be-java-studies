package july2422.hackerrank;

import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = (int) apples.stream()
                .mapToInt(i -> i)
                .map(distance -> a + distance)
                .filter(loc -> loc >= s && loc <=t)
                .count();

        int countOranges = (int) oranges.stream()
                .mapToInt(i -> i)
                .map(distance -> b + distance)
                .filter(loc -> loc >= s && loc <=t)
                .count();

        System.out.printf("%d\n%d\n", countApples, countOranges);
    }
}

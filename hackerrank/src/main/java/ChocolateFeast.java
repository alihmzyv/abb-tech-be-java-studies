public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        //1. buys and eats n / c chocolate
        //2. wrappers = n / c
        //3. buys and eats wrappers / m, wrappers = % m
        //4. wrappers += wrappers / m
        //5. back to 3, loop, till wrapper / m == 0
        int countEaten = n / c;
        int countWrappers = countEaten;
        while (countWrappers / m != 0) {
            int temp = countWrappers / m;
            countEaten += temp;
            countWrappers %= m;
            countWrappers += temp;
        }
        return countEaten;
    }
}

package july2622.hackerrank;

public class UtopianTree {
    public static int utopianTree(int n) {
        int countCycles = 0;
        int height = 1; //initially 1


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                height++;
            }
            else {
                height*=2;
            }
        }

        return height;
    }
}

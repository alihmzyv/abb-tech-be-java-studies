package july2522.hackerrank;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        int countFromFront = 0;
        int countFromBack = 1;
        int minPages = countFromFront;

        //count from front
        for (int i = 2; i <= p; i++) {
            if (i % 2 ==0) {
                countFromFront++;
            }
        }

        //count from back
        for (int i = n-1; i >= p ; i--) {
            if (i % 2 != 0) {
                countFromBack++;
            }
        }

        if (countFromBack < countFromFront) {
            minPages = countFromBack;
        }

        return minPages;
    }
}

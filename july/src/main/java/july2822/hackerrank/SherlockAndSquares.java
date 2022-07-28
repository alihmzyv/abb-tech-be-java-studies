package july2822.hackerrank;

public class SherlockAndSquares {
    public static int squares(int a, int b) {
        int countSquareIntegers = (int) Math.sqrt(b) - (int) Math.sqrt(a);
        if (Math.pow((int) Math.sqrt(a), 2) == a) {
            countSquareIntegers++;
        }
        return countSquareIntegers;
    }
}

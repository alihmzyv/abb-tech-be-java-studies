package problems.easy;

public class Sqrt69 {
    public int mySqrt(int x) {
        long result = 1;

        for (; result * result <= x; result++) {
        }

        return (int) --result;
    }
}

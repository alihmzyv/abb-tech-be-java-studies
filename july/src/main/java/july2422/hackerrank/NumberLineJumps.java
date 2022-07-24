package july2422.hackerrank;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        //result = "YES" only when x1 + v1*t = x2 + v2*t & t is a positive integer
        try {
            return ((x2 - x1)/(v1 - v2) >= 0 & (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO";
        }
        catch (ArithmeticException exc) {//error thrown, cant divide by zero: v1 == v2
            return (x1 == x2) ? "YES" : "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(NumberLineJumps.kangaroo(43, 2, 70, 2));
    }
}

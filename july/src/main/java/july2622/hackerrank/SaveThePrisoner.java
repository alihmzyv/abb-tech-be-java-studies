package july2622.hackerrank;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(530, 533048047, 529));
    }
    public static int saveThePrisoner(int n, int m, int s) {
        int numOfSeatWarned = s - 1 + m % n;

        if (numOfSeatWarned > n) {
            numOfSeatWarned-=n;
        }

        return numOfSeatWarned;

        // m % n
        // s = s - 1 + m % n - n
        //
    }
}

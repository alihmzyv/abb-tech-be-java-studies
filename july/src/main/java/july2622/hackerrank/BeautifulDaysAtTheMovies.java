package july2622.hackerrank;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int[] daysNums = new int[(j - i) + 1];
        int countBeautifulDays = 0;

        //fill the number of days array with day numbers
        for (int l = i, x = 0; l <= j; l++, x++) {
            daysNums[x] = l;
        }

        //count beautiful days
        for (int dayNum: daysNums) {
            if ((dayNum - reverseInt(dayNum)) % k ==0) {
                countBeautifulDays++;
            }
        }

        return countBeautifulDays;
    }

    public static int reverseInt(int a) { //returns the reverse of an integer
        StringBuilder sb = new StringBuilder();

        while(a > 0) {
            sb.append(a % 10);
            a/=10;
        }

        return Integer.parseInt(sb.toString());
    }
}

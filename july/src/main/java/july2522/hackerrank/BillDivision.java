package july2522.hackerrank;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int refund = b - bill.stream().
                mapToInt(i -> i).sum()/2;
        System.out.println(refund == 0 ? "Bon Appetit" : refund);
    }
}

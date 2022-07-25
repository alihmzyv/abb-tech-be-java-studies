package july2522.hackerrank;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int[] billArr = bill.stream().mapToInt(i->i).toArray();
        int totalBillReduced = 0;
        int correctShareOfAnna;

        for (int i = 0; i < billArr.length; i++) {
            if (i != k) {
                totalBillReduced+=billArr[i];
            }
        }

        correctShareOfAnna = totalBillReduced / 2;

        System.out.println(correctShareOfAnna == b ? "Bon Appetit" : b - correctShareOfAnna);
    }
}

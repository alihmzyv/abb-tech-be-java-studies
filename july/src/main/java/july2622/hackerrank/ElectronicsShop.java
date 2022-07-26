package july2622.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        //take inputs
        Scanner in = new Scanner(System.in);
        Integer[] arrInputLine1 = convertStrArrtintArr(in.nextLine().split(" "));
        int budget = arrInputLine1[0]; //no need to save the lengths

        Integer[] pricesListOfKeyboards = convertStrArrtintArr(in.nextLine().split(" "));
        Integer[] pricesListOfDrives = convertStrArrtintArr(in.nextLine().split(" "));
        in.close();
        int maxMostExpended = -1;

        Arrays.sort(pricesListOfDrives, Collections.reverseOrder());
        Arrays.sort(pricesListOfKeyboards, Collections.reverseOrder());

        for (int i = 0; i < pricesListOfKeyboards.length; i++) {
            for (int j = 0; j < pricesListOfDrives.length; j++) {
                if (pricesListOfKeyboards[i] + pricesListOfDrives[j] <= budget) {
                    if (pricesListOfKeyboards[i] + pricesListOfDrives[j] > maxMostExpended) {
                        maxMostExpended = pricesListOfKeyboards[i] + pricesListOfDrives[j];
                    }
                }
            }
        }

        System.out.println(maxMostExpended);
    }

    public static Integer[] convertStrArrtintArr(String[] arrStr) {
        Integer[] arr = new Integer[arrStr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        return arr;
    }
}

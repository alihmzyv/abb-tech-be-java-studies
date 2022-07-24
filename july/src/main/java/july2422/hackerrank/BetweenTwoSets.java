package july2422.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> x = List.of(3, 6, 9);
        List<Integer> y = List.of(36, 72);

        System.out.println(BetweenTwoSets.getTotalX(x, y));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        //convert to arrays for faster execution
        int count = 0; //result to be returned
        int[] aArr = a.stream().mapToInt(i->i).toArray();
        int[] bArr = b.stream().mapToInt(i->i).toArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        List<Integer> multiplesOflcmOfA = new ArrayList<>();


        // * find gcd of elements of a
        int gcdA = 1;
        for (int i = 2; i <= aArr[0]; i++) {
            if (arrIsDivisibleBy(aArr, i)) { //if all the elements can be divided by i without remainder
                gcdA = i;
            }
        }




        // * find lcm of elements of a
        int lcmA;
        if (aArr.length == 1) {
            lcmA = aArr[0];
        }
        else {
            lcmA = multipleAllEls(aArr) / gcdA;
        }

        System.out.println(lcmA);

        // * find multiples of lcm of elements of a that are less than the least (first element) of b's elements
        for (int i = lcmA; i <= bArr[0]; i+=lcmA) {
            multiplesOflcmOfA.add(i);
        }


        //convert to int[] arr
        int[] multiplesOflcmOfAArr = multiplesOflcmOfA.stream().mapToInt(i->i).toArray();

        for (int multipleOflcmOfA: multiplesOflcmOfAArr) {
            if (arrIsDivisibleBy(bArr, multipleOflcmOfA)) {
                count++;
            }
        }

        return count;
    }

    public static boolean arrIsDivisibleBy(int[] arr, int num) {
        boolean result = true;

        for (int el: arr) {
            if (el % num != 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static int multipleAllEls(int[] arr) {
        int result = 1;

        for (int x: arr) {
            result*=x;
        }

        return result;
    }
}

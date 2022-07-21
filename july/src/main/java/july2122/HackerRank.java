package july2122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerRank {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        scan.close();
//        StringBuilder sb = new StringBuilder();
//        boolean addedNewLine = true;
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (Pattern.matches("[a-zA-Z]", String.valueOf(s.charAt(i)))) {
//                sb.append(s.charAt(i));
//                addedNewLine = false;
//                if (i == s.length() - 1) {
//                    count++;
//                }
//            }
//            else if(!addedNewLine) {
//                sb.append("\n");
//                count++;
//                addedNewLine = true;
//            }
//        }
//
//        System.out.println(count+"\n"+sb.toString().trim());


        //Patter Syntax Checker
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String pattern = in.nextLine();
//
//            try {
//                Pattern.compile(pattern);
//                System.out.println("Valid");
//            }
//
//            catch (PatternSyntaxException exc) {
//                System.out.println("Invalid");
//            }
//
//            testCases--;
//        }

        //Primality test
        /*ufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger num = new BigInteger(n);

        System.out.println(num.isProbablePrime(1) ? "prime" : "not prime");*/

        //Java BigInteger easy
//        Scanner sn = new Scanner(System.in);
//
//        String s1 = sn.nextLine();
//        String s2 = sn.nextLine();
//
//        sn.close();
//
//        BigInteger a = new BigInteger(s1);
//        BigInteger b = new BigInteger(s2);
//
//        System.out.println(a.add(b));
//        System.out.println(a.multiply(b));

        //1D array

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        int[] a = new int[n];
//
//        // reads and assigns
//
//        for (int i = 0; i < n; i++) {
//            a[i] = scan.nextInt();
//        }
//
//        //print elements
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> arrRowItems = new ArrayList<>();
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowTempItems[j]);
//                arrRowItems.add(arrItem);
//            }
//
//            arr.add(arrRowItems);
//        }
//
//        bufferedReader.close();
//
//        int maxSum = 0;
//        int newSum = 0;
//
//
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
                  /*if (i == 0 & j == 0) {
                      maxSum = newSum;
                  }*/
//                newSum = (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)) + arr.get(i+1).get(j+1) +
//                        (arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2));
//                if (newSum>maxSum) {
//                    maxSum = newSum;
//                }
//            }
//        }
//
//        System.out.println(maxSum);

        //java subarray


        /*Scanner sn = new Scanner(System.in);
        int size = sn.nextInt();

        int[] arr = new int[size];
        sn.nextLine();

        String[] arrStrCopy = sn.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStrCopy[i]);
        }

        int countNegSubArrs = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (sumArray(Arrays.copyOfRange(arr, i, j+1)) < 0) {
                    countNegSubArrs++;
                }
            }
        }

        System.out.println(countNegSubArrs);*/

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();

    }

    public static int sumArray(int[] array) {
        int sum = 0;

        for(int num: array) {
            sum+= num;
        }

        return sum;
    }

    public static boolean canWin(int leap, int[] game) {
        boolean result = false;
        int cell = 0;

        for (int i = 0; i < game.length; i++) {
            if (i+1 < game.length && game[i+1] == 0) {
                cell = i + 1;
            }
            else {
                if ((i+leap < game.length && game[i+leap] == 0) || i + leap > game.length - 1) {
                    cell = i + leap;
                    break;
                }
                else {
                    break;
                }
            }

            if (cell >= game.length-1) {
                result = true;
                break;
            }
        }

        return result;
    }
}

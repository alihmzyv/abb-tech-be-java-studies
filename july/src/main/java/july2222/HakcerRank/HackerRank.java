package july2222.HakcerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerRank {
    public static void main(String[] args) {
    }
    //Algorithms preparation
    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;

        for (var num: ar) {
            sum+=num;
        }

        return sum;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointsAlice = 0;
        int pointsBob = 0;

        for (int i = 0; i < a.toArray().length; i++) {
            if (a.get(i) > b.get(i)) {
                pointsAlice++;
            }
            else if (a.get(i) < b.get(i)) {
                pointsBob++;
            }
        }

        return Arrays.asList(new Integer[]{pointsAlice, pointsBob});
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for (long each: ar) {
            sum+=each;
        }
        return sum;
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;

        int i;
        int j;
        for (i = 0, j = arr.toArray().length - 1; i < arr.toArray().length; i++, j--) {
            sumLeftDiagonal+=arr.get(i).get(i);
            sumRightDiagonal+=arr.get(i).get(j);
        }

        return Math.abs(sumLeftDiagonal - sumRightDiagonal);
    }

    public static void plusMinus(List<Integer> arr) {
        int countNeg = 0;
        int countPos = 0;
        int countZeros = 0;

        for (int x: arr) {
            if (x<0) {
                countNeg++;
            }
            else if (x>0) {
                countPos++;
            }
            else {
                countZeros++;
            }
        }

        //ratios
        double negRat = (double) countNeg / arr.toArray().length;
        double posRat = (double) countPos / arr.toArray().length;
        double zerosRat = (double) countZeros / arr.toArray().length;

        System.out.printf("%8.6f%n%8.6f%n%8.6f", posRat, negRat, zerosRat);
    }

    public static void staircase(int n) {
        System.out.println(getStaircaseOf(n));
    }

    public static String getStaircaseOf(int n) {
        StringBuilder sb = new StringBuilder();
        int numberOfSpaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("#");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void miniMaxSum(List<Integer> arr) {
        Object[] arrTemp = arr.toArray();
        Arrays.sort(arrTemp);
        long minSumOfFourEl = 0;
        long maxSumOfFourEl = 0;



        for (int i = 0, j = arrTemp.length - 1; i < 4; i++, j--) {
            minSumOfFourEl += (Integer) arrTemp[i];
            maxSumOfFourEl += (Integer) arrTemp[j];
        }

        System.out.printf("%d %d\n", minSumOfFourEl, maxSumOfFourEl);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int countTallestCandles = 0;
        Object[] candlesArr = candles.toArray();

        //find tallest one
        Arrays.sort(candlesArr);
        int tallestCandle = (int) candlesArr[candlesArr.length - 1];

        //find the number of tallest ones
        for (int candle: candles) {
            if (candle == tallestCandle) {
                countTallestCandles++;
            }
        }

        return countTallestCandles;
    }

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s.substring(2, s.length() - 2));
        boolean timeIsAM = s.substring(s.length() - 2).equals("AM");

        if (s.substring(0, 2).equals("12")) {
            if (timeIsAM) {
                sb.insert(0, "00");
            }
            else {
                sb.insert(0, "12");
            }
        }
        else {
            if (timeIsAM) {
                sb.insert(0, s.substring(0, 2));
            }
            else {
                sb.insert(0, Integer.parseInt(s.substring(0, 2)) + 12);
            }
        }

        return sb.toString();
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] rankings = new int[ranked.toArray().length];
        int[] playerRankings = new int[player.toArray().length];


        //give rankings according to scoreboard
        int lastRank = 1;
        for (int i = 0; i < ranked.toArray().length; i++) {
            if (i == 0 || ranked.get(i).equals(ranked.get(i-1))) {
                rankings[i] = lastRank;
            }
            else {
                rankings[i] = ++lastRank;
            }
        }

        //give rankings according to each score of player
        for (int i = 0; i < player.toArray().length; i++) {
            if (i!=0 && player.get(i).equals(player.get(i-1))) {
                playerRankings[i] = playerRankings[i-1];
                continue;
            }
            for (int j = 0; j < ranked.toArray().length; j++) {
                if (player.get(i) >= ranked.get(j)) {
                    playerRankings[i] = rankings[j];
                    break;
                }
            }

            if (playerRankings[i] == 0) {
                playerRankings[i] = rankings[rankings.length - 1] + 1;
            }
        }

        return IntStream.of(playerRankings).boxed().collect(Collectors.toList());
    }

}

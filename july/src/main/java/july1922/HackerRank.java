package july1922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.spi.CalendarNameProvider;

public class HackerRank {
    public static void main(String[] args) throws IOException {

        /*Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        System.out.printf("%s %s\n", A.substring(0,1).toUpperCase() + A.substring(1), B.substring(0,1).toUpperCase() + B.substring(1));
        *//* Enter your code here. Print output to STDOUT. */

        /*Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));*/

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        scan.nextLine();
//        String s = scan.nextLine();
//        double d = scan.nextDouble();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

        /*Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
            sc.nextLine();
        }
        System.out.println("================================");*/

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d\n", N, i, N * i);
//        }
//
//        bufferedReader.close();

        /*System.out.println(4^2);
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            System.out.println(getQuerie(a, b, n));
        }
        in.close();*/


/*
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(x>=-32768 && x<=32767) {
                    System.out.println("* short\n* int\n* long");
                } else if (x>=-Math.pow(2, 31) && x<=Math.pow(2, 31) - 1) {
                    System.out.println("* int\n* long");
                } else if (x>=-Math.pow(2, 63) && x<=Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }*/

        /*Scanner sc = new Scanner(System.in);
        int n = 1;

        while(sc.hasNext()) {
            System.out.printf("%d %s\n", n, sc.nextLine());
            n++;
        }*/

        /*System.out.println(findDay(8, 5, 2015));*/

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = A.length()-1; i>=0; i--) {
//            sb.append(A.charAt(i));
//        }
//
//        System.out.println(sb.toString().equals(A) ? "Yes" : "No");
        /* Enter your code here. Print output to STDOUT. */

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
//            }
//            else if(!addedNewLine) {
//                sb.append("\n");
//                count++;
//                addedNewLine = true;
//            }
//        }
//
//        System.out.println(count+"\n"+sb.toString().trim());
    }

    public static String getQuerie(int a, int b, int n) {
        int sNth = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sNth += a;

            for (int j = 0; j <=i ; j++) {
                sNth += (int) Math.pow(2, j) * b;
            }

            sb.append(sNth);

            if(i != n-1) {
                sb.append(" ");
            }

            sNth = 0;
        }

        return sb.toString();
    }

    public static String findDay(int month, int day, int year) {
        Calendar clndr = Calendar.getInstance();
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy");
            Date date = simpleDateFormat.parse(String.format("%02d%02d%d", day, month, year));

            clndr.setTime(date);
        }
        catch (ParseException exc) {
            System.out.println(exc);
        }

        return days[clndr.get(Calendar.DAY_OF_WEEK)-1];
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0,k);

        for (int i = 1; i < s.length()-k+1; i++) {
            if (s.substring(i, i+k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i+k);
            }
            if (s.substring(i, i+k).compareTo(largest) > 0) {
                largest = s.substring(i, i+k);
            }
        }

        return smallest + "\n" + largest;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int countA = 0;
        int countB = 0;
        char ch = (char) (-1);
        boolean isAnagram = true;
        String sample = a.length() > b.length() ? a : b;

        for (int i = 0; i < sample.length(); i++) {
            ch = sample.charAt(i);

            //count ch in A
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ch) countA++;
            }

            //count ch in B
            for (int j = 0; j < b.length(); j++) {
                if(b.charAt(j) == ch) countB++;
            }

            if (countA != countB) {
                isAnagram = false;
                break;
            }
            else {
                countA = 0;
                countB = 0;
            }
        }

        return isAnagram;
    }

}

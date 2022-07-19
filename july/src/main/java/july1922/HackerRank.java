package july1922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class HackerRank {
    public static void main(String[] args) throws IOException {

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

        System.out.println(findDay(8, 5, 2015));
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

}

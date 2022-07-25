package july2522.hackerrank;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        String date;
        if (year < 1918) {
            if (year % 4 ==0) {
                date = String.format("12.09.%d", year);
            }
            else {
                date = String.format("13.09.%d", year);
            }
        }
        else if (year == 1918) {
            date = String.format("26.09.%d", year);
        }
        else {
            if (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0)) {
                date = String.format("12.09.%d",year);
            }
            else {
                date = String.format("13.09.%d", year);
            }
        }

        return date;
    }
}

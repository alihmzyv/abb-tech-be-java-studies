package august2122;

import java.time.*;
import java.util.regex.Pattern;

public class DateTimeDemo {
    public static void main(String[] args) {
        //current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //format
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.printf("%d/%d/%d\n", dd, mm, yyyy);

        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.printf("%d:%d:%d\n", h, m, s);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(dt);

        LocalDateTime dt2 = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
        System.out.println(dt2);

        System.out.println(dt2.plusMonths(100));

        LocalDate birthday = LocalDate.of(2001, Month.MARCH, 24);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        System.out.printf("I'm %d year, %d months, %d days not old young :)\n", period.getYears(), period.getMonths(),
                                                                    period.getDays());

        System.out.printf("I am %d days old\n", period.toTotalMonths() * 31); //approximately

        Year year = Year.of(LocalDate.now().getYear());
        System.out.println(String.format("%d year is %sa leap year", year.getValue(), year.isLeap() ? "" : "not "));

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zoneDT = ZonedDateTime.now(la);
        System.out.println(zoneDT);
    }
}

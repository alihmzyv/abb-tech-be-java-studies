package august2222;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class DateTimeDemo {
    public static void main(String[] args) {
//        LocalDate myBirthday = LocalDate.of(2001, Month.MARCH, 24);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.LLLL.yyyy");
//        String myBirthday2 = myBirthday.format(formatter);
//        System.out.println(myBirthday + ", " + myBirthday2);
//
//        //subtract one month
//        System.out.println(LocalDate.now().minus(1, ChronoUnit.MONTHS)
//                .format(DateTimeFormatter.ofPattern("dd LLLL yyyy")));
//
//        //get DayOfWeek, day of month
//        DayOfWeek dayOfWeek = LocalDate.parse("24 March 2001", DateTimeFormatter.ofPattern("dd LLLL yyyy")).getDayOfWeek();
//
//
//        //take time from the beginning of the day
//        LocalDateTime time = LocalDate.parse("2001-05-24").atStartOfDay();
//        System.out.println(time);


        //LocalTime
//        LocalTime time1 = LocalTime.parse("05:00");
//        System.out.println(time1);
//
//        LocalTime tim2 = LocalTime.of(5, 30);
//        System.out.println(tim2);
//
//        LocalTime time = LocalTime.parse("06:30").plusHours(1);
//        System.out.println(time);
//        boolean isBefore = time1.isBefore(time); //05:00 < 06:30, true
//        System.out.println(isBefore);
//
//        LocalTime min = LocalTime.MIN;
//        LocalTime max = LocalTime.MAX;
//
//        //LocalDateTime
//        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
//        LocalDateTime localDateTime1 = LocalDateTime.parse("24 March 2001 00:00:00", DateTimeFormatter.ofPattern("dd LLLL yyyy HH:mm:ss"));
//        System.out.println(localDateTime1);

        //ZonedDateTime API
//        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();
//        List<String> zoneIDsList = new ArrayList<>(zoneIDs);
//        Collections.sort(zoneIDsList);
//        System.out.println(zoneIDsList);
//

//        ZoneId zoneId = ZoneId.of("Africa/Kampala");
//        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(LocalDateTime.now(), zoneId);
//        System.out.println(zonedDateTime1);
//        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+02:00"));
//        System.out.println(zonedDateTime1 + ", " + offsetDateTime);
//
//        LocalDate initialDate = LocalDate.now();
//        LocalDate finalDate = initialDate.plus(Period.ofWeeks(1));
//        System.out.println(finalDate);
//
//        System.out.println(Period.between(initialDate, finalDate).getDays());
//
//        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
//
//        System.out.println(Duration.between(offsetDateTime, offsetDateTime.plusMonths(2)).getSeconds());
//
//        zonedDateTime1
//                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
//                        .withLocale(Locale.UK));
//        System.out.println(zonedDateTime1);
//        ZoneId.getAvailableZoneIds().stream()
//                .filter(ZoneIdStr -> ZoneIdStr.contains("America"))
//                .forEach(System.out::println);
//        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
//        LocalDateTime localDateTime1 = LocalDateTime.now();
//        System.out.println(localDateTime);
//        System.out.println(localDateTime1);
//        long minutesBetween = ChronoUnit.MINUTES.between(localDateTime, localDateTime1);
//        System.out.printf("There are %.2f hours difference in time between Baku and Detroit!", (double) minutesBetween / 60);

    }

}

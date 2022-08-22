package august2222;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateAndTimeDemo2 {

    public LocalDate getMyBirthday() {
        return LocalDate.of(2001, Month.MARCH, 24);
    }

    public LocalTime getSampleLocalTime() {
        return LocalTime.of(12, 30);
    }

    public LocalDateTime getSampleLocalDateTime() {
        return LocalDateTime.of(2001, Month.MARCH, 24, 12, 30);
    }

    public LocalDateTime getComponentDateTime() {
        return LocalDateTime.of(getMyBirthday(), getSampleLocalTime());
    }

    public LocalDate getTodayFromLocalDateTime() {
        return LocalDateTime.now().toLocalDate();
    }

    public LocalTime getLocalTimeFromLocalDateTime() {
        return LocalDateTime.now().toLocalTime();
    }

    public int getDifferenceBetweenLondonAndParis() {
        return ZonedDateTime.now(ZoneId.of("Europe/London")).getHour()
                - ZonedDateTime.now(ZoneId.of("Europe/Paris")).getHour();
    }

    //second examples
    public boolean isTodayAfterTomorrow() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return today.isAfter(tomorrow);
    }

    public DayOfWeek getLastDayOfMonth() {
        LocalDate today = LocalDate.now();
        DayOfWeek lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        return lastDayOfMonth;
    }

    public int getNumberOfDaysUntilLongestDayOfYear() {
        LocalDate today = LocalDate.now();
        LocalDate longestDayOfYear = today.with(Month.JUNE).withDayOfMonth(21);
        Period between = Period.between(today, longestDayOfYear);
        return between.getDays();
    }

    public List<DayOfWeek> getLastDaysOfMonthsInYear(int year) {
        return Arrays.stream(Month.values())
                .map(month ->
                        LocalDate.now().
                                withYear(year).
                                with(month).
                                with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek())
                .toList();

    }
}

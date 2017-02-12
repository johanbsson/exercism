import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

/**
 * Created by johan on 2017-02-12.
 */
public class DateFinder {
    DayOfWeek dayOfWeekFirstWeek;
    DayOfWeek dayOfWeekLastWeek;
    LocalDate firstDateOfMonth;
    LocalDate lastDateOfMonth;
    public DateFinder(int year, int month) {

        firstDateOfMonth =  LocalDate.of(year, month, 1);
        lastDateOfMonth = firstDateOfMonth.with(lastDayOfMonth());
        dayOfWeekFirstWeek = firstDateOfMonth.getDayOfWeek();
        dayOfWeekLastWeek = lastDateOfMonth.getDayOfWeek();
    }
}

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
    int year;
    int month;
    public DateFinder(int year, int month) {
        this.year = year;
        this.month = month;
        firstDateOfMonth =  LocalDate.of(year, month, 1);
        lastDateOfMonth = firstDateOfMonth.with(lastDayOfMonth());
        dayOfWeekFirstWeek = firstDateOfMonth.getDayOfWeek();
        dayOfWeekLastWeek = lastDateOfMonth.getDayOfWeek();
    }

    public LocalDate getFirstDateInPeriod(MeetupSchedule meetupSchedule) {
        LocalDate firstDataInPeriod = null;
        if(meetupSchedule == MeetupSchedule.TEENTH){
            firstDataInPeriod = LocalDate.of(year, month, 13);
        }
        else if(meetupSchedule == MeetupSchedule.FIRST){
            firstDataInPeriod = firstDateOfMonth;
        }
        else if(meetupSchedule == MeetupSchedule.SECOND){
            firstDataInPeriod = firstDateOfMonth.plusDays(7);
        }
        else if(meetupSchedule == MeetupSchedule.THIRD){
            firstDataInPeriod = firstDateOfMonth.plusDays(14);
        }
        else if(meetupSchedule == MeetupSchedule.FOURTH){
            firstDataInPeriod = firstDateOfMonth.plusDays(21);
        }

        return firstDataInPeriod;
    }

    public LocalDate getLastDateInMonth() {
        return lastDateOfMonth;
    }
}

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;


/**
 * Created by johan on 2017-02-09.
 */
public class Meetup {

    int month;
    int year;
    DayOfWeek dayOfWeekFirstWeek;
    DayOfWeek dayOfWeekLastWeek;
    LocalDate firstDateOfMonth;
    LocalDate lastDateOfMonth;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
        firstDateOfMonth =  LocalDate.of(year, month, 1);
        lastDateOfMonth = firstDateOfMonth.with(lastDayOfMonth());
        dayOfWeekFirstWeek = firstDateOfMonth.getDayOfWeek();
        dayOfWeekLastWeek = lastDateOfMonth.getDayOfWeek();

    }
    public LocalDate day(DayOfWeek d, MeetupSchedule s) {
        DayOfWeek day = d;
        MeetupSchedule shedule = s;
        DateFinder df = new DateFinder(year  ,month);
        LocalDate firstDataInPeriod = LocalDate.of(year, month, 13);
        //LocalDate firstDataInPeriod = df.getFirstDateInPeriod()
        DayOfWeek weekDayOfFirstTenthDay = firstDataInPeriod.getDayOfWeek();
        DayDiffer mg;
        mg = new DayDiffer();
        int countToDay = mg.countFromDayToDayForward(weekDayOfFirstTenthDay, d);
        return  firstDataInPeriod.plusDays(countToDay);
    }
}


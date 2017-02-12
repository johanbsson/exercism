import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;


/**
 * Created by johan on 2017-02-09.
 */
public class Meetup {

    int month;
    int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;

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


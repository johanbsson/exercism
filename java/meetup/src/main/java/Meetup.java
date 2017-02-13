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
    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {
        DayOfWeek day = dayOfWeek;
        MeetupSchedule shedule = meetupSchedule;

        DateFinder df = new DateFinder(year  ,month);
        //Find the first day in period, the date and the weekday
        LocalDate firstDateInPeriod = df.getFirstDateInPeriod(meetupSchedule);
        //Find out what the weekday is for this date
        DayOfWeek weekDayOfFirstDay = firstDateInPeriod.getDayOfWeek();

        //Find out how many days it is to the wanted day
        DayDiffer dd;
        dd = new DayDiffer();
        int countToDay = dd.countFromDayToDayForward(weekDayOfFirstDay, dayOfWeek);

        //Add countToDay to firsDateInPeriod
        LocalDate theDateWeAreLookingFor  = firstDateInPeriod.plusDays(countToDay);
        return theDateWeAreLookingFor;
    }
}


import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;


/**
 * Created by johan on 2017-02-09.
 */
public class Meetup {
    MeetupManager mm;
    public Meetup(int month, int year) {
       mm = new MeetupManager(month ,year);
    }
    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {
        return mm.findDay(dayOfWeek, meetupSchedule);
    }
}


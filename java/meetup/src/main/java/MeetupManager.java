import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by johan on 2017-02-13.
 */
public class MeetupManager {
    DateFinder df = null;
    DayDiffer dd = null;

    public MeetupManager(int month, int year) {
        df = new DateFinder(year, month);
        dd = new DayDiffer();
    }

    public LocalDate findDay(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {
        LocalDate firstDateInPeriod = df.getFirstDateInPeriod(meetupSchedule);
        DayOfWeek weekDayOfFirstDay = firstDateInPeriod.getDayOfWeek();
        int countToDay = dd.countFromDayToDayForward(weekDayOfFirstDay, dayOfWeek);
        LocalDate theDateWeAreLookingFor  = firstDateInPeriod.plusDays(countToDay);
        return theDateWeAreLookingFor;
    }
}

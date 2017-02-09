import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by johan on 2017-02-09.
 */
public class MeetupExp {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2013, 3, 1);
        Month m = dt.getMonth();
        Meetup me = new Meetup(3, 2013);
        int wnr = me.getWeekNumber(dt);
        System.out.println("Veckonummer: " + wnr);
        final DayOfWeek dayOfWeek = dt.getDayOfWeek();
        System.out.printf("Day of week " + dayOfWeek);
    }
}

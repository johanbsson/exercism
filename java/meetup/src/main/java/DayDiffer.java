import java.io.FileOutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by johan on 2017-02-11.
 */
public class DayDiffer {
    public DayDiffer() {
        DayOfWeek [] dayArray = {
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY,
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY
        } ;
         l = new ArrayList<DayOfWeek>(Arrays.asList(dayArray));


    }
    private List<DayOfWeek> l;
    /*
    public LocalDate doSomeMagic(LocalDate firstTenthDate, DayOfWeek weekDayOfFirstTenthDay) {
        LocalDate theDate = null;
        return theDate;
    }
    */

    public int countFromDayToDayForward(DayOfWeek weekDayOfFirstDay, DayOfWeek toDay) {

        System.out.printf("index of first day " + l.indexOf(weekDayOfFirstDay));
        System.out.printf("index of second day " + l.indexOf(toDay));
        int ret = l.indexOf(toDay) - l.indexOf(weekDayOfFirstDay);

        return ret;
    }
}

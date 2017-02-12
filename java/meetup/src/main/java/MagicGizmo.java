import java.io.FileOutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johan on 2017-02-11.
 */
public class MagicGizmo {
    public LocalDate doSomeMagic(LocalDate firstTenthDate, DayOfWeek weekDayOfFirstTenthDay) {
        LocalDate theDate = null;
        return theDate;
    }

    /**
     * Calculates the forward distance between two weekdays
     * @param weekDayOfFirsthDay
     * @param toDay
     * @return
     */
    public int countFromDayToDayForward(DayOfWeek weekDayOfFirstDay, DayOfWeek toDay) {

        DayOfWeek [] dayArray = DayOfWeek.values()[
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
                        ];
        List<DayOfWeek> l = new ArrayList<DayOfWeek>(dayArray);
        l.


        //monday - tuesday = 1 to wed = 2 etc

        return 1;
    }
}

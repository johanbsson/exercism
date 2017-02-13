import java.time.DayOfWeek;
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
         dayList = new ArrayList<DayOfWeek>(Arrays.asList(dayArray));


    }
    private List<DayOfWeek> dayList;

    public int countFromDayToDayForward(DayOfWeek firstDayInPeriod, DayOfWeek targetDay) {
        int indexOfFirstDay = dayList.indexOf(firstDayInPeriod);
        List<DayOfWeek> sublistForWeek = dayList.subList(indexOfFirstDay, indexOfFirstDay + 7);
        int dayDiffForward = sublistForWeek.indexOf(targetDay);
        return dayDiffForward;
    }
}

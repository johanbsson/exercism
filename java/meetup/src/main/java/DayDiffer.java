import java.time.DayOfWeek;
import java.util.*;

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

    public int countFromLastToTargetDayForward(DayOfWeek lastDayOfMonth, DayOfWeek dayOfWeek) {
        //todo invert dayList
        ArrayList<DayOfWeek> reverseDayList = new ArrayList<DayOfWeek>(dayList);
        Collections.reverse(reverseDayList);
        System.out.println("reversed day list" +reverseDayList);
        int indexOfLastDayOfMonth = reverseDayList.indexOf(lastDayOfMonth);
        List<DayOfWeek> reversedSubList = reverseDayList.subList(indexOfLastDayOfMonth,  indexOfLastDayOfMonth +7);
        System.out.println("reversed sublist " + reversedSubList);
        int dayDiffBackwards = reversedSubList.indexOf(dayOfWeek);
       //todo make sublist from lastDayOfMonth
        //todo calculate day diff
        System.out.println("daydiffbackwards " + dayDiffBackwards);
        return dayDiffBackwards;
    }
}

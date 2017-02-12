import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.*;

/**
 * Created by johan on 2017-02-12.
 */
public class DayDifferTest {
    @Test
    public void  test_monday_and_forward(){
        DayDiffer mg = new DayDiffer();
        assertEquals(0, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.MONDAY));
        assertEquals(1, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.TUESDAY));
        assertEquals(6, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.SUNDAY));

    }

    @Test
    public void  test_tuesday_and_forward(){
        DayDiffer mg = new DayDiffer();
        assertEquals(0, mg.countFromDayToDayForward(DayOfWeek.TUESDAY, DayOfWeek.TUESDAY));
        assertEquals(1, mg.countFromDayToDayForward(DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY));
        assertEquals(6, mg.countFromDayToDayForward(DayOfWeek.TUESDAY, DayOfWeek.MONDAY));

    }
    @Test
    public void  test_sunday_and_forward(){
        DayDiffer mg = new DayDiffer();
        assertEquals(0, mg.countFromDayToDayForward(DayOfWeek.SUNDAY, DayOfWeek.TUESDAY));
        assertEquals(1, mg.countFromDayToDayForward(DayOfWeek.SUNDAY, DayOfWeek.MONDAY));
        assertEquals(6, mg.countFromDayToDayForward(DayOfWeek.SUNDAY, DayOfWeek.SATURDAY));

    }

}
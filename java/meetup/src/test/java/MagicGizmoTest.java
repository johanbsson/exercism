import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.*;

/**
 * Created by johan on 2017-02-12.
 */
public class MagicGizmoTest {
    @Test
    public void  test_monday_and_forward(){
        MagicGizmo mg = new MagicGizmo();
        assertEquals(0, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.MONDAY));
        assertEquals(1, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.TUESDAY));
        assertEquals(6, mg.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.SUNDAY));

    }

}
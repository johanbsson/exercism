import java.time.DayOfWeek;

/**
 * Created by johan on 2017-02-12.
 */
public class GizmoRunner {
    public static void main(String[] args) {
        MagicGizmo g = new MagicGizmo();

        int count = g.countFromDayToDayForward(DayOfWeek.MONDAY, DayOfWeek.FRIDAY);
        System.out.println("Diff is :" + count);
    }
}

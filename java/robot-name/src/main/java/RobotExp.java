import java.util.Random;

/**
 * Created by johan on 2017-02-09.
 */
public class RobotExp {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(2));
        char a = 'A';
        char b = 'B';
        int inta = a;
        int intb = b;

        System.out.println("A is:" + inta + " and B is:" + intb);
    }
}

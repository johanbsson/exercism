import java.util.Random;

/**
 * Created by johan on 2017-02-09.
 */
public class Robot {
    private String name;
    Robot()
    {
        name = getNewName();
    }
    void reset() {
        name = getNewName();
    }
    private String getNewName(){
        return twoLetters() + threeDigits();
    }
    private String threeDigits(){
        String digits = "";
        Random r = new Random();
        for(int i = 0; i < 3; i++){
           int x = r.nextInt(10);
           digits += x;
        }
        return digits;
    }
    String twoLetters(){
        return oneLetter() + oneLetter();
    }
    private String oneLetter(){
        char a = 'A';
        char z = 'Z';
        Random r = new Random();
        int diff = z-a;
        int newint = r.nextInt(diff);
        int newchar = a + newint ;
        Character ret = (char) (newchar);
        return ret.toString();
    }

    String getName() {
        return name;
    }
}
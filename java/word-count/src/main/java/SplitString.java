import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by johan on 2017-02-03.
 */
public class SplitString {
    public static void main(String[] args) {
        String s = "I want to walk my dog";
        String[] arr = s.split(" ");
        Map<String, Integer> m = new HashMap<>();
        for ( String ss : arr) {
            Integer i = m.get(ss);
            System.out.println(ss);
            m.put(ss, 34);
        }
        for ( String ss : arr) {
            Integer i = m.get(ss);
        }
    }
}

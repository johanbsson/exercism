import java.util.*;

/**
 * Created by johan on 2017-02-01.
 */
public class EtlRunner {
    public static void main(String[] args) {
        System.out.println("Hello");

        Etl etl = new Etl();


        Map<Integer, List<String>> old = new HashMap<Integer, List<String>>() {
            {
                put(1, Arrays.asList("A", "E", "I", "O", "U"));
            }
        };
        old = Collections.unmodifiableMap(old);



        Map<String, Integer> output;
        output= etl.transform(old);
        System.out.println(output);


        //Expected output
        Map<String, Integer> expected;
        expected = new HashMap<String, Integer>() {
            {
                put("a", 1);
            }
        };
        expected = Collections.unmodifiableMap(expected);
    }
}

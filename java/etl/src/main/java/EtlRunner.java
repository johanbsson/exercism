import java.util.*;

/**
 * Created by johan on 2017-02-01.
 */
public class EtlRunner {
    public static void main(String[] args) {

        Etl etl = new Etl();
        Map<String, Integer> output;



        //Transorm old
        //output= etl.transform(old);
        //Print result
        //System.out.println(output);

        //Transform old
        //Iterate over map

        Map<String, Integer> expected;
        expected = new HashMap<String, Integer>();
        expected.put("a", 1);
        expected = Collections.unmodifiableMap(expected);
    }
}

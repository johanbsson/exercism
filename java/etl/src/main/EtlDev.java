import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by johan on 2017-02-02.
 */
public class EtlDev {
    public static void main(String[] args) {

        Map<String, Integer> expected = new HashMap<String, Integer>();
        String targetString = "";
        Map<Integer, List<String>> old = new HashMap<Integer, List<String>>() {
            {
                put(1, Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"));
                put(2, Arrays.asList("D", "G"));
                put(3, Arrays.asList("B", "C", "M", "P"));
                put(4, Arrays.asList("F", "H", "V", "W", "Y"));
                put(5, Arrays.asList("K"));
                put(8, Arrays.asList("J", "X"));
                put(10, Arrays.asList("Q", "Z"));
            }
        };
        for (Integer key : old.keySet()) {

            System.out.println("------------------------------------------------");
            System.out.println("Iterating or looping map using java5 foreach loop");
            System.out.println("key: " + key + " value: " + old.get(key));
            List<String> keyList = old.get(key);
            //Iterate over list
            for (String temp : keyList) {
                System.out.println(temp);
                targetString = temp.toLowerCase();
                expected.put(targetString, key);
            }
        }
        System.out.println(expected);
    }
}

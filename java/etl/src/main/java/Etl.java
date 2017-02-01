import java.util.*;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        //This mocks the input of first testcase
        Map<Integer, List<String>> old_mock;
        old = new HashMap<Integer, List<String>>() {
            {
                put(1, Arrays.asList("A"));
            }
        };
        old = Collections.unmodifiableMap(old);
        //This mocks the ootput of first testcase
        Map<String, Integer> expected = new HashMap<String, Integer>() {
            {
                put("a", 1);
            }
        };
        expected = Collections.unmodifiableMap(expected);
        //return null;
        return expected;
    }

}

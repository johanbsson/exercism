import java.util.*;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        Map<String, Integer> result = new HashMap<String, Integer>();
        String targetString;

        for (Integer key : old.keySet()) {
            List<String> keyList = old.get(key);
            //Iterate over list
            for (String temp : keyList) {
                System.out.println(temp);
                targetString = temp.toLowerCase();
                result.put(targetString, key);
            }
        }

        result = Collections.unmodifiableMap(result);
        return result;
    }

}

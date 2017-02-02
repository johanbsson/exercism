import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by johan on 2017-02-02.
 * Examples of iterating over a map
 * source:
 * http://javarevisited.blogspot.se/2011/12/how-to-traverse-or-loop-hashmap-in-java.html
 */
public class IterateMaps {
    public static void main(String[] args) {
        iterone();
        itertwo();
        iterthree();
        iterfour();
    }
    private static void iterone() {
        HashMap<String, String> loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");

        for (String key : loans.keySet()) {
            System.out.println("------------------------------------------------");
            System.out.println("Iterating or looping map using java5 foreach loop");
            System.out.println("key: " + key + " value: " + loans.get(key));
        }
    }
    private static void itertwo() {
        HashMap<String, String> loans;
        loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");
        Set<String> keySet = loans.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext()) {
            System.out.println("------------------------------------------------");
            System.out.println("Iterating Map in Java using KeySet Iterator");
            String key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + loans.get(key));
        }
    }
    private static void iterthree() {
        HashMap<String, String> loans;
        loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");
        Set<Map.Entry<String, String>> entrySet = loans.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("------------------------------------------------");
            System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
    private static void iterfour(){
        HashMap<String, String> loans;
        loans = new HashMap<String, String>();
        loans.put("home loan", "citibank");
        loans.put("personal loan", "Wells Fargo");
        Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();
        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
        while (entrySetIterator.hasNext()) {
            System.out.println("------------------------------------------------");
            System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
            Map.Entry entry = entrySetIterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}



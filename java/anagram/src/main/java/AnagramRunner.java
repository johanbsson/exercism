import java.util.Arrays;
import java.util.List;


/**
 * Created by johan on 2017-02-07.
 */
public class AnagramRunner {
    public static void main(String[] args) {
        /*
        Anagram a = new Anagram("apa");
        List<String> list = Arrays.asList("hello", "world", "zombies", "pants");

        boolean condition = a.isAnagram("Paa");
        System.out.println("is anagram " + condition);
        boolean c2 = a.sameWordIgnoreCase("Apa");
        System.out.println("Is same word " + c2);

       String s1 = "Apabepa";
        String s2= a.sortAndNormalizeString(s1);
        System.out.println(s1 + " sorted is " + s2);
        */

        Anagram detector = new Anagram("Orchestra");
        List<String> anagrams = detector.match(Arrays.asList("cashregister", "Carthorse", "radishes"));
        System.out.println( anagrams);


    }
}

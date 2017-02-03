import java.util.HashMap;
import java.util.Map;

/**
 * Created by johan on 2017-02-03.
 */
public class StringToMap {
    public static void main(String[] args) {

        String dna = "ACGT";
        Map<Character, Integer >  countPerNucleid = new HashMap<Character, Integer>();
        countPerNucleid.put('A', 0);
        countPerNucleid.put('C', 0);
        countPerNucleid.put('G', 0);
        countPerNucleid.put('T', 0);
        System.out.println(countPerNucleid);
        Integer a;
        for(Character ch: dna.toCharArray()){
           countPerNucleid.put(ch, countPerNucleid.get(ch) + 1);
        }
        System.out.println(countPerNucleid);

    }
}

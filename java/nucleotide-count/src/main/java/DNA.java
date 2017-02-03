import java.util.HashMap;
import java.util.Map;

public class DNA {
    private String dna;
    private Map<Character, Integer> dnaMap;
    public DNA(String dnaInput) {
        dna = dnaInput;
    }

    public int count(Character nucleotide) {
        //todo count a certain character in dna string
        Integer count = 0;
        System.out.println("Dna is " + dna);
        System.out.println("Count before for each" + count);
        for(Character ch: dna.toCharArray()){
            System.out.println("Running for each");
           count = count + 1;
        }
        System.out.println("Count after for each" + count);

        return count;
    }

    public Map<Character,Integer> nucleotideCounts() {
        //todo Genereta a hashmap with count per character
        Map<Character, Integer> counts;
        dnaMap = new HashMap<Character, Integer>();
        dnaMap.put('A', 0);
        dnaMap.put('C', 0);
        dnaMap.put('G', 0);
        dnaMap.put('T', 0);
        for(Character n: dna.toCharArray()){
            dnaMap.put(n, dnaMap.get(n) + 1);
        }

        return dnaMap;

    }
}

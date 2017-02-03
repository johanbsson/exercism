import java.util.HashMap;
import java.util.Map;

public class DNA {
    private String dna;
    private Map<Character, Integer> dnaMap;
    public DNA(String dnaInput) {
        dna = dnaInput;
    }

    public int count(Character nucleotide) {
        Integer count = 0;

        String validInput = "ACGT";
        if(validInput.indexOf(nucleotide) == -1){
            throw new IllegalArgumentException();
        }
        for(Character ch: dna.toCharArray()){
            if(ch == nucleotide){
                count = count + 1;
            }
        }
        return count;
    }

    public Map<Character,Integer> nucleotideCounts() {
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

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String sentence) {
        System.out.println("The string phrase received was " + sentence);
        Map<String, Integer> wordMap;
        wordMap = new HashMap<String, Integer>();
        String[] wordArray;
        wordArray = sentence.split(" ");
        for(String w : wordArray){
            System.out.println("w is this in for loop " + w);
            String temps = removeCrapAndNormalize(w);
            if("".equals(temps)){
                System.out.println("Stängen var tom, skit i den");
            }
            else if(wordMap.get(temps) == null){
                System.out.println("Wordmap with key " + temps + " was "  + wordMap.get(temps));
                wordMap.put(temps, 1);
            }
            else {
                System.out.println("Word " + w + " was already in wordMap");
                wordMap.put(temps, wordMap.get(temps) + 1);
            }
        }
        System.out.println("The wordmap returned is " + wordMap);
        return wordMap;
    }

    private String removeCrapAndNormalize(String ss) {
        char [] arr_to_clean = ss.toCharArray();
        StringBuffer sb = new StringBuffer("");
        for(char c : arr_to_clean){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                System.out.println("Character was " + c + " I am adding it");
                sb.append(c);
            }

        }
        String retur = sb.toString();

        retur = retur.toLowerCase();
        System.out.println("Retur är " + retur);
        return retur;
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String word) {
        Map<String, Integer> wordMap;
        wordMap = new HashMap<>();
        //todo split string
        System.out.println("Phrase is:: " + word);
        String[] wordArray;
        wordArray = " ".split(word);
        System.out.println("wordArray is: " + wordArray.toString());

        //todo interate over string

        for(String w : wordArray){
            System.out.println("w in loop is" + w);
            //todo check if string is in map
            if(wordMap.get(w) == -1){
                //todo if not add it with coint of 1
                wordMap.put(w, 1);
            }
            else {
                //todo if it is present, increas count
                wordMap.put(w, wordMap.get(w) + 1);
            }



        }
        return wordMap;
    }
}

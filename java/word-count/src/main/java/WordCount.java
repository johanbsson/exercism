import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String word) {
        Map<String, Integer> wordMap;
        wordMap = new HashMap<String, Integer>();
        //todo split string
        String[] wordArray;
        wordArray = " ".split(word);
        System.out.println("wordArray is here " + wordArray);

        //todo interate over string

        for(String w : wordArray){
            //fixme It seems like variable w is empty here
            //todo find out how to iterate over  word array
            //todo maybe it's the string thats empty in testcase that causes problem
            System.out.println("w is this in for loop " + w);
            //todo check if string is in map
            if(wordMap.get(w) == null){
                //todo if not add it with coint of 1
                System.out.println("w is this in for loop " + w);

                System.out.println("before w is " + w);
                wordMap.put(w, 1);
                System.out.println("after w is " + w);
                System.out.println("Wordmap after init of word " + wordMap);
            }
            else {
                //todo if it is present, increas count
                wordMap.put(w, wordMap.get(w) + 1);
            }



        }
        return wordMap;
    }
}

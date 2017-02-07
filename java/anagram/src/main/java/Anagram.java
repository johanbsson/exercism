import java.util.*;
public class Anagram {
    /** This is the base for anagrams */
    private String anagramWord;

    public Anagram(String anagram) {
        this.anagramWord = anagram;
    }

    List<String> match(List<String> listOfAnagramCandidates) {
        List<String> listWithAnagrams = new ArrayList<>();
        HashSet<String> hashSetForUniqueWords = new HashSet<>();
        for(String w:listOfAnagramCandidates){
            boolean sameAsAnagramWord = w.toLowerCase().equals(anagramWord.toLowerCase());
           if(isAnagram(w) && !sameAsAnagramWord) {
               hashSetForUniqueWords.add(w);
           }
        }
        for(String s: hashSetForUniqueWords){
            listWithAnagrams.add(s);
        }
        return listWithAnagrams;
    }
    public boolean sameWordIgnoreCase(String w){
        boolean ret = w.toLowerCase().equals(anagramWord.toLowerCase());
        return ret;
    }
    public boolean isAnagram(String word){
        boolean isAnagram = false;
        String baseWordAsSortedString = sortAndNormalizeString(anagramWord);
        String wordAsSortedString = sortAndNormalizeString(word);
        if(baseWordAsSortedString.equals(wordAsSortedString)){
            isAnagram = true;
        }
        return isAnagram;
    }

    public String sortAndNormalizeString(String input){
        char[] cArray = input.toLowerCase().toCharArray();
        Arrays.sort(cArray);
        String ret = new String(cArray).toLowerCase();
       return ret;
    }

}

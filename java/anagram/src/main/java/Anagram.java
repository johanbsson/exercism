import java.util.*;
public class Anagram {
    /** This is the base for anagrams */
    private String anagramWord;

    public Anagram(String anagram) {
        this.anagramWord = anagram;
    }

    List<String> match(List<String> listOfAnacramCandidates) {
        List<String> listWithAnagrams = new ArrayList<>();
        //Will use this to only get unique words
        HashSet<String> hashSetForUniqueWords = new HashSet<>();

        for(String w:listOfAnacramCandidates){
            boolean sameAsAnagramWord = w.toLowerCase().equals(anagramWord.toLowerCase());
           if(isAnagram(w.toLowerCase()) && !sameAsAnagramWord) {
               hashSetForUniqueWords.add(w);
           }
        }
        for(String s: hashSetForUniqueWords){
            listWithAnagrams.add(s);
        }
        return listWithAnagrams;
    }
    //Try two
    private boolean sameWordsIgnoreCase(String w1, String w2){
        boolean ret = w1.toLowerCase().equals(w2.toLowerCase());
        System.out.println("Words " + w1 + " and " + w2 + " Same? " + ret);
        return ret;

    }
    private boolean isAnagram(String word){
        boolean isAnagram = false;
        String baseWordAsSortedString = convertWordToSortedList(anagramWord).toLowerCase();
        String wordAsSortedString = convertWordToSortedList(word).toLowerCase();
        if(baseWordAsSortedString.equals(wordAsSortedString)){
            isAnagram = true;
        }


        return isAnagram;
    }
    //try two

    String convertWordToSortedList(String input){
        char[] cArray = input.toCharArray();
        ArrayList<Character> templist = new ArrayList<>();
        for(char c:cArray){
            templist.add(c);
        }
        java.util.Collections.sort(templist);
        return templist.toString().toLowerCase();

    }

}

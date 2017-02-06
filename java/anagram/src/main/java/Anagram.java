import javafx.collections.transformation.SortedList;

import java.util.*;

public class Anagram {
    private String baseword;

    public Anagram(String baseword) {
        this.baseword = baseword;
    }

    List<String> match(List<String> words) {
        List<String> anagramList = new ArrayList<>();
        for(String w:words){
           if(isAnagram(w)) {
               System.out.println("Added word " + w);
               anagramList.add(w);
           }
        }
        return anagramList;
    }
    private boolean isAnagram(String word){
       boolean isAnagram = false;
       List<Character> baseWordAsSortedList = convertWordToSortedList(baseword);
        List<Character> wordAsSortedList = convertWordToSortedList(word);
        if(wordAsSortedList.size() == baseWordAsSortedList.size() && wordAsSortedList.containsAll(baseWordAsSortedList)){

            System.out.println("Word " + word + " was anagram");
            isAnagram = true;
        }


        return isAnagram;
    }
    List<Character> convertWordToSortedList(String input){
        char[] cArray = input.toCharArray();
        ArrayList<Character> templist = new ArrayList<>();
        for(char c:cArray){
            templist.add(c);
        }
        java.util.Collections.sort(templist);
        System.out.println(templist);
        return templist;
    }

}

import java.util.*;
public class Anagram {
    private String anagramWord;

    public Anagram(String word) {
        this.anagramWord = word;
    }

    List<String> match(List<String> words) {
        List<String> anagramList = new ArrayList<>();
        //Will use this to only get unique words
        HashSet<String> hs = new HashSet<>();

        for(String w:words){
            //todo refactor logical expression
            //todo folow up uses of lowerCase, maybe uneeded uses somewhere
            boolean sameAsAnagramWord = w.toLowerCase().equals(anagramWord.toLowerCase());
            System.out.println("Word is " + w);
           if(isAnagram(w.toLowerCase()) && !sameAsAnagramWord) {
               System.out.println("And it was added to hashset");
               hs.add(w);
           }
        }
        for(String s: hs){
            anagramList.add(s);
        }
        return anagramList;
    }
    //Try two
    private boolean isAnagram(String word){
        boolean isAnagram = false;
        System.out.println("In isAnagram word is " + word);
        String baseWordAsSortedString = convertWordToSortedList(anagramWord).toLowerCase();
        System.out.println("BaseWordAsSortedString is: " +baseWordAsSortedString);
        String wordAsSortedString = convertWordToSortedList(word).toLowerCase();
        System.out.println("WordAsSortedStringIs: " + wordAsSortedString);
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
   /*
    //Try one
    private boolean isAnagramold(String word){
       boolean isAnagram = false;
       List<Character> baseWordAsSortedList = convertWordToSortedList(anagramWord);
        List<Character> wordAsSortedList = convertWordToSortedList(word);


        boolean isSameSize = wordAsSortedList.size() == baseWordAsSortedList.size();

        boolean containsSameLetters = wordAsSortedList.containsAll(baseWordAsSortedList)
                && baseWordAsSortedList.containsAll(baseWordAsSortedList);
        //wordAsSortedList.
        if( isSameSize && containsSameLetters) {
            System.out.println("Word " + word + " was anagram");
            isAnagram = true;
        }
        return isAnagram;
    }
    //try one

    List<Character> convertWordToSortedListold(String input){
        char[] cArray = input.toCharArray();
        ArrayList<Character> templist = new ArrayList<>();
        for(char c:cArray){
            templist.add(c);
        }
        java.util.Collections.sort(templist);
        System.out.println(templist);
        return templist;
    }
    */

}

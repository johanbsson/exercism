import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by johan on 2017-02-04.
 */
public class Pangrams {
    public static boolean isPangram(String pangram){
        boolean isPangram = false;
        int nrOffLettersInAlpabet = 26;

        pangram = purgeNonAscii(pangram);
        System.out.println("after purge: " + pangram);

        //String pangram = "the quick brown fox jumps over the lazy dog";
        TreeSet<Character> lettersInSentence = new TreeSet<>();
        char[] pangramArray = pangram.toCharArray();
        Arrays.sort(pangramArray);
        System.out.println("Length of sentence is: " +pangramArray.length);
        for(char c : pangramArray){
            if(Character.isAlphabetic(c)){
                System.out.println("Orig letter is:" + c);
                lettersInSentence.add(Character.toLowerCase(c));
            }
        }
        for (Character character : lettersInSentence) {
            System.out.println("Char is: " + character);
        }
        System.out.println("Number of unique letters is:" + lettersInSentence.size());
        if(lettersInSentence.size() == nrOffLettersInAlpabet){
            isPangram = true;
        }

        return isPangram;
    }

    public static String purgeNonAscii(String indata){
        String utdata =  indata.replaceAll("[^\\p{ASCII}]", "");
        return utdata;
    }
}

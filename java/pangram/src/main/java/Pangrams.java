import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by johan on 2017-02-04.
 */
public class Pangrams {
    public static boolean isPangram(String pangram){
        boolean isPangram = false;
        int nrOffLettersInAlpabet = 26;
        pangram = purgeNonAscii(pangram);
        TreeSet<Character> lettersInSentence = new TreeSet<>();
        char[] pangramArray = pangram.toCharArray();
        Arrays.sort(pangramArray);
        for(char c : pangramArray){
            if(Character.isAlphabetic(c)){
                lettersInSentence.add(Character.toLowerCase(c));
            }
        }
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

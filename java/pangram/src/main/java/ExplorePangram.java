import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by johan on 2017-02-04.
 */
public class ExplorePangram {
    public static void main(String[] args) {
        String pangram = "the quick brown fox jumps over the lazy dog";
        Set<Character> lettersInSentence;
        char[] pangramArray = pangram.toCharArray();
        Arrays.sort(pangramArray);
        System.out.println("Number of letters is: " +pangramArray.length);
        lettersInSentence = new TreeSet<>();
        for(char c : pangramArray){
            lettersInSentence.add(c);
        }
        for (Character character : lettersInSentence) {
            System.out.println("Char is: " + character);
        }
    }
}

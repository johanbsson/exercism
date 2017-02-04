import java.util.Arrays;

/**
 * Created by johan on 2017-02-04.
 */
public class ExplorePangram {
    public static void main(String[] args) {
        String pangram = "the quick brown fox jumps over the lazy dog";
        int length = 0;
        char[] pangramArray = pangram.toCharArray();
        Arrays.sort(pangramArray);
        System.out.println("Length is: " +pangramArray.length);

        /*
        Character a = 'a';
        Character z = 'z';
        int ai = a;
        int zi = z;

        System.out.println("a is nr: " + ai + " Z is nr: " + zi);


        for(int i = ai; i <= zi; i++ ){
            char ch = (char) i;
            System.out.println("Char is: " + ch);

        }
        */

        /*
        Find unique values q

        You can do it in one line in java 7:

String[] unique = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);
and shorter and simpler in java 8:

String[] unique = Arrays.stream(array).distinct().toArray(new String[0]);



         */
    }
}

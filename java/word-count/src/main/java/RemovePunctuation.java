import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by johan on 2017-02-04.
 */
public class RemovePunctuation {

    public static void main(String[] args) {

        String s = "car : carpet as java : javascript!!&@$%^&";
        String[] arr = s.split(" ");
        for ( String ss : arr) {
            String retur = removeCrap(ss);
            System.out.println("Cleaned string: " + retur);

        }
    }

    private static String removeCrap(String ss) {
         char [] arr_to_clean = ss.toCharArray();
        StringBuffer sb = new StringBuffer("");
         for(char c : arr_to_clean){
             if(Character.isAlphabetic(c)){
                sb.append(c);
             }

         }


         return sb.toString();
    }


}

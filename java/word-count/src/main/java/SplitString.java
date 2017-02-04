/**
 * Created by johan on 2017-02-03.
 */
public class SplitString {
    public static void main(String[] args) {
        String s = "I want to walk my dog";

        String[] arr = s.split(" ");

        for ( String ss : arr) {

            System.out.println(ss);
        }
    }
}

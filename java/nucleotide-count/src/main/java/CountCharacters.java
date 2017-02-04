/**
 * Created by johan on 2017-02-03.
 */
public class CountCharacters {
    public static void main(String[] args) {
        Character c = 'A';
        String s = "ABCDA";
        int count = 0;
        for (Character i: s.toCharArray()){
            if(c == i){
                count++;
            }

        }
        System.out.println("Antal a: "+ count);
    }
}

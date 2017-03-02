/**
 * Created by johan on 2017-03-01.
 */
public class AcronymExp {
    public static void main(String[] args) {
        String indata = "en apa är en apa ,.:;";

        char[] arr = indata.toCharArray();


        for(char c: arr){
            System.out.println("-----------------------");
            System.out.println("Tecken:" +c + ":");

            if(Character.isAlphabetic(c)){
                System.out.println("is alpabetic");
            }
            if(Character.isSpaceChar(c)){
                System.out.println("is spaceChar");
            }
            if(Character.isUpperCase(c)){
                System.out.println("is upper");
            }
            if(Character.isLowerCase(c)){
                System.out.println("is lower");
            }

        }
    }
}

/**
 * Created by johan on 2017-02-28.
 */
public class Acronym {
    public static String generate(String words){
        char[] arr = words.toCharArray();
        StringBuffer sb = new StringBuffer();


        for(char c: arr){
            if(Character.isAlphabetic(c)){
                sb.append(c);
            }
            else{
                sb.append(";");
            }

        }

        String[] split = sb.toString().split(";");

        StringBuffer sb2 = new StringBuffer();
        for(String s:split){
            System.out.println(s);
            if(s.length() > 0 )
            sb2.append(s.charAt(0));
        }
        String result = sb2.toString().toUpperCase();
        System.out.println(result);
        return result;


    }
}

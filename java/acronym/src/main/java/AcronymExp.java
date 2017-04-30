/**
 * Created by johan on 2017-03-01.
 */
public class AcronymExp {
    public static void main(String[] args) {
        String indata = "apa bapa.cepa-depa";

        char[] arr = indata.toCharArray();
        StringBuffer sb = new StringBuffer();


        for(char c: arr){
            if(Character.isAlphabetic(c)){
                System.out.println("is alpabetic");
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
            sb2.append(s.charAt(0));
        }
        System.out.println(":"+sb2.toString().toUpperCase()+":");
    }
}

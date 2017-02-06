/**
 * Created by johan on 2017-02-06.
 */
public class RemoveNonAscii {
    public static void main(String a[]){
        String str = "Bj��rk����oacute�";
        System.out.println(str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println("After removing non ASCII chars:");
        System.out.println(str);
    }
    public static String purgeNonAscii(String indata){
       String utdata =  indata.replaceAll("[^\\p{ASCII}]", "");
       return utdata;
    }
}

/**
 * Created by johan on 2017-02-27.
 */
public class RnaTranscription {
    public static String ofDna(String s) {
        String rna = "";
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: charArray){
            sb.append(convert(c));

        }

        return sb.toString();
    }
    private static char convert(char c){
        char out;

        switch (c){

            case 'G':
                out = 'C';
                break;
            case 'C':
                out = 'G';
                break;
            case 'T':
                out = 'A';
                break;
            case 'A':
                out = 'U';
                break;
            default:
                out = '-';
        }
        return out;
    }
}
/**
G -> C
        C -> G
        T -> A
        A -> U
        **/
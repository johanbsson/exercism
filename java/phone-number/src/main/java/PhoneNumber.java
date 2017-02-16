import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by johan on 2017-02-13.
 */
public class PhoneNumber {
    String validNumber;
    String dirtyNumber;
    String cleanNumber;
    private final static String wrongLengthExceptionMessage = "Number must be 10 or 11 digits";
    private final static String numberIs11DigitsButDoesNotStartWith1ExceptionMessage =
            "Can only have 11 digits if number starts with '1'";
    private final static String illegalCharacterExceptionMessage =
            "Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.";
    public PhoneNumber(String s) {
       this.dirtyNumber = s;
        cleanNumber = cleanNumber(this.dirtyNumber);
        validNumber = validateNumber(this.cleanNumber);
    }

    public String getNumber() {
       return  validNumber;
    }

    private String validateNumber(String cleanNumber) {
        boolean elevenLong = cleanNumber.length() == 11;
        boolean tenLong = cleanNumber.length() == 10;
        boolean startsWith1 = cleanNumber.charAt(0) == '1';
        String vnr = null;
        if(tenLong){
            vnr = cleanNumber;
        }
        else if(elevenLong){
            if(startsWith1){
                //remove first
                vnr =  cleanNumber.substring(1);
            }
            else {
                //throw exception
                throw new IllegalArgumentException(numberIs11DigitsButDoesNotStartWith1ExceptionMessage);
            }
        }
        else {
            throw new IllegalArgumentException(wrongLengthExceptionMessage);
        }
        return vnr;
    }

    private String cleanNumber(String s) {
       StringBuilder sb = new StringBuilder();
       for( Character c :s.toCharArray()){
           System.out.println("char is>"+ c + "<");

           if(isValidChar(c) || Character.isDigit(c)) {
               if(Character.isDigit(c)){
                   sb.append(c);
               }
           }
           else {
               //throw invalid character
               throw new IllegalArgumentException(illegalCharacterExceptionMessage);
           }
       }
       return sb.toString();
    }
    private boolean isValidChar(char c){

        Character[] vc;
        vc = new Character[]{
                ' ',
                '(',
                ')',
                '.',
                '-',
                '\''
        };
        System.out.println("Valid chars :" + vc + ":");
        //ArrayList<Character> cl = new ArrayList<Character>(validChars);
        ArrayList<Character> cl = new ArrayList<>();
        for (Character x : vc){
            cl.add(x);
        }
        boolean contains = cl.contains(c);
        boolean isDigit = Character.isDigit(c);
        boolean ret = contains || isDigit;
        return ret;
    }
}
/*
If the phone number is less than 10 digits assume that it is bad number
If the phone number is 10 digits assume that it is good
If the phone number is 11 digits and the first number is 1, trim the 1 and use the last 10 digits
If the phone number is 11 digits and the first number is not 1, then it is a bad number
If the phone number is more than 11 digits assume that it is a bad number

Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.";
*/

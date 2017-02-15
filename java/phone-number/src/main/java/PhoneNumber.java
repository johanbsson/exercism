/**
 * Created by johan on 2017-02-13.
 */
public class PhoneNumber {
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
        validateNumber(cleanNumber);
    }

    public String getNumber() {
       return  cleanNumber;
    }

    private void validateNumber(String cleanNumber) {
        System.out.println("Number is: " + cleanNumber);
        System.out.println("Length of number " + cleanNumber.length());
        System.out.println("Starts whith: " + cleanNumber.charAt(0));
        System.out.println("If is: " + (cleanNumber.length() == 11 && cleanNumber.charAt(0) == '1' ));
        boolean elevenLongStartsWith1 = cleanNumber.length() == 11 && cleanNumber.charAt(0) == '1' ;
        System.out.println("elevenLongStartsWith1 is: " + elevenLongStartsWith1);
        boolean tenLong = cleanNumber.length() == 10;
        System.out.println("tenLong is: " + tenLong);
        boolean validLength = tenLong && elevenLongStartsWith1;
        System.out.println("validlenth -  tenLong || elevenLongStartsWith1 is: " + validLength);
        if(validLength){
            System.out.println("Does not throw exception");
        }
        else {
            System.out.println("Throws exception");
            throw new IllegalArgumentException(wrongLengthExceptionMessage);
        }
    }

    private String cleanNumber(String s) {
       StringBuilder sb = new StringBuilder();
       for( Character c :s.toCharArray()){
         if(Character.isDigit(c)){
            sb.append(c);
         }
       }
       return sb.toString();
    };
    private boolean isValidChar(char c){
        return true;
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

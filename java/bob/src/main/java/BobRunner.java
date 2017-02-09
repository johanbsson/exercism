/**
 * Created by johan on 2017-02-09.
 */
public class BobRunner {
    public static void main(String[] args) {
        Bob bob = new Bob();

        //todo this should be of some type, but all types are false,

        String indata = "1,2,3";

        System.out.println("Testing with string: " + indata);
        System.out.println("Is question " + bob.isQuestion(indata));
        System.out.println("Is shout " + bob.isShout(indata));
        System.out.println("Is something " + bob.isShout(indata));
        System.out.println("Is nothing " + bob.isNoting(indata));
    }
}

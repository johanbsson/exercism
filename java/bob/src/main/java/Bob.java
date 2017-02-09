/**
 * Created by johan on 2017-02-08.
 */
public class Bob {
    public String hey(String s) {
        String bobAnswer = null;
        if(isQuestion(s)){
            bobAnswer = BobSpeak.toQuestion;
        }
        else if(isShout(s)){
            bobAnswer = BobSpeak.toYelling;
        }
        else if(isSomething(s)){
            bobAnswer = BobSpeak.toSomething;
        }
        else{
            bobAnswer = BobSpeak.toNothing;
        }

        return bobAnswer;
    }
    boolean isQuestion(String s){
        boolean ret = false;
        ret = s.endsWith("?") && ! isShout(s);
        return ret;
    }
    boolean isShout(String s){
        boolean ret = false;
        //ret = s.endsWith("!") && isUpperCase2(s);
        ret = isUpperCase2(s);
        return ret;
    }
    boolean isSomething(String s){
        boolean ret = false;
        ret = !isQuestion(s) && ! isShout(s) && isNoting(s);
        return ret;
    }
    boolean isNoting(String s){
        boolean ret = false;
        ret = s.lastIndexOf(s) == 0;
        return ret;
    }
    boolean hasCapital(String test1){
        //test1 = "Hello"// your string;
        String test2 = test1.toLowerCase();
        return !test1.equals(test2);
    }

      public boolean isUpperCase2(String s)
      {
          for (int i=0; i<s.length(); i++)
          {
              if (Character.isLowerCase(s.charAt(i)))
              {
                  return false;
              }
          }
          return true;
      }
}
class BobSpeak {
    public static String toQuestion = "Sure.";
    public static String toYelling = "Whoa, chill out!";
    public static String toNothing = "Fine. Be that way!";
    public static String toSomething = "Whatever.";
}

/*
End with ?
    Bob answers 'Sure.' if you ask him a question.
Ends witht ! isShouting
        He answers 'Whoa, chill out!' if you yell at him.
isNothing
        He says 'Fine. Be that way!' if you address him without actually saying anything.
isSometing
        He answers 'Whatever.' to anything else.
        */

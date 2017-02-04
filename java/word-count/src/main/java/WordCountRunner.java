import java.util.Map;

/**
 * Created by johan on 2017-02-03.
 */
public class WordCountRunner {
    public static void main(String[] args) {
        WordCount wc = new WordCount();

        Map<String, Integer> m = wc.phrase("hej du du glade2 hej du! 12!3 12!3  ");
    }
}

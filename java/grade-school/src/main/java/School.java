import java.text.CollationElementIterator;
import java.util.*;

/**
 * Created by johan on 2017-02-16.
 */
public class School {
    private Map<Integer, List<String>> rooster;

    public School() {
        rooster = new TreeMap<Integer, List<String>>();
    }

    public int  numberOfStudents() {
        //todo fix this class so that it returns a real value
         Set<Integer> s =  (Set<Integer>) rooster.keySet();
        int pupilsInSchool = 0;
        for(int i: s){
            List<String> theClass = rooster.get(i);
           pupilsInSchool += theClass.size();
        }
        return pupilsInSchool;
    }

    public void add(String theName, int theClass) {
        //Lägg indata i någon datastruktur
        if(rooster.get(theClass) == null){
            rooster.put(theClass, new ArrayList<String>());
        }
        rooster.get(theClass).add(theName);
        Collections.sort(rooster.get(theClass));
    }

    public Collection<String>  grade(int theClass) {
        List<String> li = (List<String>) rooster.get(theClass);
        if(li == null) li = new ArrayList<String>();
        return li;
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
        return Collections.unmodifiableMap(rooster);
    }

}

/**
 * Created by johan on 2017-02-09.
 */
public class Robot {
    String name;
    public Robot(){
        generateName();
    }
    public String getName(){
        return name;
    }

    public void reset() {
    }
    private void generateName(){

        name = "AB123";
    }
}
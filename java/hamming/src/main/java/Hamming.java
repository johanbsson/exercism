public class Hamming {
    //GACT
    static public int compute(String n1, String n2){
        int distance = 0;
        if(n1.length() !=  n2.length()){
            System.out.println("input was invalid");
            throw new IllegalArgumentException();
        }
        char[] n1a = n1.toCharArray();
        char[] n2a = n2.toCharArray();

        for(int i = 0; i < n1.length(); i++){
            if(n1a[i] != n2a[i]) distance++;
        }


        return distance;
    }

    private static boolean isInvalid(String n2) {
        return false;
    }
}

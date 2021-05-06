import java.util.*;


/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        char[] warray = word.toCharArray();
        for(int i = 0; i < warray.length; i++){
            char[] w = warray.length-i-1;
            System.out.println(warray[warray.length-i-]);
        }
    }
}
import java.util.*;


public class MirrorSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        while(numTests > 0){
            int start = input.nextInt();
            int end = input.nextInt();
            String myString = "";
            while(start <= end){
                myString += String.valueOf(start);
                start++;
            }
            StringBuilder sb = new StringBuilder(myString);
            sb.reverse();
            System.out.println(myString + sb.toString());
            numTests--;
        }
        
    }
}

import java.util.*;



public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = 1;
        while(numLines != 0){
                numLines = input.nextInt();
                String[] myArray = new String[numLines];
                int max = -1;
                for(int i = 0; i < numLines; i++){
                    String myString = input.next();
                    myArray[i] = myString;
                    if(myString.length() > max){
                        max = myString.length();
                    }
                }
                String ans = "";
                // System.out.println(max);
                for(int i = 0; i < numLines; i++){
                    for(int j = 0; j < max - myArray[i].length(); j++){
                        ans += " ";
                    }
                    ans += myArray[i];
                    if(numLines != 0){
                    System.out.println(ans);
                    }
                    ans = "";
                    // if(i == numLines - 1){
                    //     System.out.print("\n");
                    // }
                }
        }
    }
}

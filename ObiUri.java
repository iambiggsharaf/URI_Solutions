import java.util.*;


public class ObiUri{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords = input.nextInt();
        String ans = "";
        for(int i = 0; i < numWords; i++){
            String myWord = input.next();
            if(myWord.length() == 3 && myWord.substring(0, 2).equals("UR")){
                myWord = "URI ";
                ans += myWord;
            }
            else if(myWord.length() == 3 && myWord.substring(0, 2).equals("OB")){
                myWord = "OBI ";
                ans += myWord;
            }
            else{
                ans += myWord + " ";
            }
        }
        System.out.println(ans.substring(0, ans.length() - 1));
    }
}
import java.util.*;


public class CompleteSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numTests; i++){
            boolean myBoolArray[] = new boolean[26];
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            for(int j = 0; j < myArray.length; j++){
                if(myArray[j] >= 97 && myArray[j] <= 122){
                    myBoolArray[myArray[j] - 97] = true;
                }
            }
            int cnt = 0;
            for(int j = 0; j < 26; j++){
                if(myBoolArray[j] == true){
                    cnt++;
                }
            }
            // System.out.println(cnt);
            if(cnt == 26){
                System.out.println("frase completa");
            }
            else if(cnt < 26 && cnt >=13){
                System.out.println("frase quase completa");
            }
            else{
                System.out.println("frase mal elaborada");
            }
        }
    }    
}

import java.util.*;

public class Help {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = 1;
        while(numTests != 0){
            numTests = input.nextInt();
            int myArray[] = new int[26];
            boolean myBoolArray[] = new boolean[26];
            int numCorrect = 0;
            for(int i = 0; i < numTests; i++){
                char identifier = input.next().charAt(0);
                int time = input.nextInt();
                String judgement = input.next(); 
                if(judgement.equals("incorrect")){
                    myArray[identifier - 65] += 20;
                }
                else{
                    myArray[identifier - 65] += time;
                    myBoolArray[identifier - 65] = true;
                    numCorrect ++;
                }
            }
            int cnt = 0;
            for(int i = 0; i < 26; i++){
                if(myBoolArray[i] == true){
                    cnt += myArray[i];
                }
            }
            if(numTests != 0){
                System.out.println(numCorrect + " " + cnt);
            }
        }
    }
}

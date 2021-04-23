import java.util.Scanner;


public class AdvancingLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();

        for(int i = 0; i < numTests; i++){

            String firstString = input.next();
            String secondString = input.next();

            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            int cnt = 0;
            
            for(int j = 0; j < firstArray.length; j++){
                if(secondArray[j] >= firstArray[j]){
                    cnt += secondArray[j] - firstArray[j];
                }
                else{
                    cnt += ('z' - firstArray[j]) + (secondArray[j] - 'a') + 1;
                }
            }
            System.out.println(cnt);
        }



    }
}

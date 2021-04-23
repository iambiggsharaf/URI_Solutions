import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class HiddenMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        input.nextLine();

        for(int i = 0; i < numTests; i++){
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            myString = "";
            boolean flag = false;

            for(int j = 0; j < myArray.length; j++){

                if(flag == false && myArray[j] != ' '){
                    myString += myArray[j];
                    flag = true;
                }
                if(flag == true && myArray[j] == ' '){
                    flag = false;
                }
            }

            System.out.println(myString);
        }
        
    }
}

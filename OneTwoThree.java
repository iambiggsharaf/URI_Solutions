import java.lang.Math;
import java.util.Scanner;

public class OneTwoThree{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numTests; i++){
            String myString = input.nextLine();
            int cnt = 0;
            char[] myArray = myString.toCharArray();
            if(myArray.length == 2){
                if(myArray[0] == 'o'){
                    cnt++;
                }
                if(myArray[1] == 'n'){
                    cnt++;
                }
                if(myArray[2] == 'e'){
                    cnt++;
                }
                if(cnt >= 2){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else{
                System.out.println(3);
            }
        }

    }
}
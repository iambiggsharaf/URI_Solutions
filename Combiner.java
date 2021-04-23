import java.util.Scanner;
import java.lang.Math;

public class Combiner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt(); 
        input.nextLine(); //avoiding problems with nextline
        for(int j = 0; j < numTests; j++){
            String myString = input.nextLine();


            String[] myArray = myString.split(" ");

            char[] firstString = myArray[0].toCharArray();
            char[] secondString = myArray[1].toCharArray();

            int minLen = Math.min(firstString.length, secondString.length);
            myString = "";
            for(int i = 0; i < minLen; i++){
                myString += firstString[i];
                myString += secondString[i];
            }


            if(firstString.length > minLen){
                for(int i = minLen; i < firstString.length; i++){
                    myString += firstString[i];
                }
            }
            else if(secondString.length > minLen){
                for(int i = minLen; i < secondString.length; i++){
                    myString += secondString[i];
                }
            }

            System.out.println(myString);
        }



    }
}

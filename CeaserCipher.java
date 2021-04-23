import java.util.Scanner;

public class CeaserCipher{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        input.nextLine(); //avoiding problems with nextLine()

        //running test cases
        for(int i = 0; i < numTests; i++){

            //getting string and number of shifts
            String mystString = input.nextLine();
            // System.out.println(mystString);
            int numSteps = input.nextInt();
            // System.out.println(numSteps);
            //shifting to number of shifts each string
            char[] myArray = mystString.toCharArray(); 
            for(int j = 0; j < myArray.length; j++){

                //checking if letter will be less than 65(A)
                if((int) myArray[j] - numSteps < 65){
                    myArray[j] -= numSteps;
                    myArray[j] += 26;
                }
                else{
                    myArray[j] -= numSteps;
                }
            }

            //printing results
            System.out.println(myArray);
            input.nextLine(); //avoiding problems with nextLine()
        }

    }
}
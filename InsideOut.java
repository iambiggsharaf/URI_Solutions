import java.util.Scanner;


public class InsideOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numTests; i++){
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            myString ="";
            for(int j = (myArray.length / 2) - 1; j  >= 0; j--){
                myString += myArray[j];
            }
            for(int j = myArray.length - 1; j >= myArray.length / 2; j--){
                myString += myArray[j];
            }
            System.out.println(myString);
        }
    }
}

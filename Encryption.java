// import java.lang.Math;
import java.util.Scanner;

public class Encryption{
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    //Getting numTest and running each Test Case
    int numTests = input.nextInt();
    input.nextLine(); // throw away the \n not consumed by nextInt()
    for(int i = 0; i < numTests; i++){
      String myString = input.nextLine();

      //shifting each char of myString to 3 to the right, if they are letters
      char[] myArray = myString.toCharArray();
      for(int j = 0; j < myArray.length; j++){

        //checking if they are letters
        int asciOfElement = (int) myArray[j];
        if((asciOfElement >= 65 && asciOfElement <= 90) || (asciOfElement >= 97 && asciOfElement <= 122)){
          myArray[j] += 3;
         } 
      }

      //reversing myString
      myString = "";
      for(int j = myArray.length - 1; j >= 0; j--){
        myString += myArray[j];
      } 
      myArray = myString.toCharArray();

      //shifting each character of second half of myString to 1 to left
      int midOfMyArray = myArray.length / 2;
      for(int j = midOfMyArray; j < myArray.length; j++){
        myArray[j] -= 1;
      }

      //printing our result, final myString
      System.out.println(myArray);
    }

    input.close();
  }
}
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        input.nextLine(); // avoiding problems with nextLine()

        //running for each Test Cases
        for (int i = 0; i < numTests; i++) {

            String myString = input.nextLine();
            // creating an array of size 26(number of letters in alphabet) filled with zeros
            int myArray[] = new int[26]; 
            char[] myCharArray = myString.toCharArray();
            for (int j = 0; j < myCharArray.length; j++) {
                myCharArray[j] = Character.toLowerCase(myCharArray[j]);
                if (myCharArray[j] >= 97 && myCharArray[j] <= 122) {
                    myArray[myCharArray[j] - 97]++;
                }
            }
            int max = -1;
            for (int j = 0; j < myCharArray.length; j++) {
                myCharArray[j] = Character.toLowerCase(myCharArray[j]);
                if (myCharArray[j] >= 97 && myCharArray[j] <= 122) {
                    if (max < myArray[myCharArray[j] - 97]) {
                        max = myArray[myCharArray[j] - 97];
                    }
                }
            }
            String ans = "";
            for (int j = 0; j < 26; j++) {
                if (myArray[j] == max) {
                    int temp = j + 97;
                    char result = (char) temp;
                    ans += result;
                }
            }
            System.out.println(ans);

        }
    }
}

import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int numTests = input.nextInt();
            input.nextLine();
            String myArray[] = new String[numTests];
            for(int i = 0; i < numTests; i++){
                String myString = input.next();
                myArray[i] = myString;
            }
            Arrays.sort(myArray);
            for(String i : myArray){
                System.out.println(i);
            }
        }
    }
}

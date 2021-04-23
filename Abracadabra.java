import java.util.*;


public class Abracadabra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.next();
            char[] myArray = myString.toCharArray();
            for(int i = 0; i < myArray.length; i++){
                myString = "";
                for(int j = 0; j < i; j++){
                    myString += " ";
                }
                for(int k = 0; k < myArray.length - i; k++){
                    myString += myArray[k] + " ";
                }
                System.out.println(myString.substring(0, myString.length() - 1));
            }
            System.out.print("\n");
        }
    }
}

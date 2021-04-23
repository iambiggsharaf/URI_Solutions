import java.util.Scanner;


public class haha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        char[] myArray = myString.toCharArray();
        myString = "";
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == 'a' || myArray[i] == 'e' || myArray[i] == 'i' || myArray[i] == 'o' || myArray[i] == 'u'){
                myString += myArray[i];
            }
        }
        String myReversedString = "";
        myArray = myString.toCharArray();
        for(int i = myArray.length - 1; i >= 0; i--){
            myReversedString += myArray[i];
        }
        if(myString.equals(myReversedString)){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
    }
}

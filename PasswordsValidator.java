import java.util.*;


public class PasswordsValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.nextLine();
            boolean number = false;
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean invalid = false;
            if(myString.length() >= 6 && myString.length() <= 32){
                char[] myArray = myString.toCharArray();
                for(int i = 0;i < myArray.length; i++){
                    if(myArray[i] >= 48 && myArray[i] <= 57){
                        number = true;
                    }
                    else if(myArray[i] >= 65 && myArray[i] <= 90){
                        upperCase = true;
                    }
                    else if(myArray[i] >= 97 && myArray[i] <= 122){
                        lowerCase = true;
                    }
                    else{
                        invalid = true;
                    }
                }
                if(number == true && upperCase == true && lowerCase == true && invalid == false){
                    System.out.println("Senha valida.");
                }
                else{
                    System.out.println("Senha invalida.");
                }
            }
            else{
                System.out.println("Senha invalida.");
            }
            
        }
    }
}

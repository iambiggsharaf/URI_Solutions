import java.util.Scanner;

/**
 * DancingSentence
 */
public class DancingSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            
            boolean flag = true;
            for(int i = 0; i < myArray.length; i++){
                if(myArray[i] == ' '){
                    continue;
                }
                else{
                    if(flag == true){
                        myArray[i] = Character.toUpperCase(myArray[i]);
                        flag = false;
                    }
                    else{
                        myArray[i] = Character.toLowerCase(myArray[i]);
                        flag = true;
                    }
                }
            }
            System.out.println(myArray);

        }

    }
}
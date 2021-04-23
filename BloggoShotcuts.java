import java.util.*;

public class BloggoShotcuts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            myString = "";
            boolean flagOfItalic = false;
            boolean flagOfBold = false;
            for(int i = 0; i < myArray.length; i++){
                if(myArray[i] == '_'){
                    if(flagOfItalic == false){
                        myString += "<i>";
                        flagOfItalic = true;
                    }
                    else{
                        myString += "</i>";
                        flagOfItalic = false;
                    }
                }
                else if(myArray[i] == '*'){
                    if(flagOfBold == false){
                        myString += "<b>";
                        flagOfBold = true;
                    }
                    else{
                        myString += "</b>";
                        flagOfBold = false;
                    }
                }
                else{
                    myString += myArray[i];
                }    
            }
            System.out.println(myString);
        }
    }
}

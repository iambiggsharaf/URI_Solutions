import java.util.Scanner;


public class ZeroMeansZero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int a = 1;
            int b = 1;
            while(a != 0 && b != 0){
                a = input.nextInt();
                b = input.nextInt();
                int s = a + b;
                String myString = String.valueOf(s);
                char[] myArray = myString.toCharArray();
                myString = "";
                for(int i = 0; i < myArray.length; i++){
                    if(myArray[i] != '0'){
                        myString += myArray[i];
                    }
                }
                if(a != 0 && b != 0){
                    System.out.println(myString);
                }
            }
        
    }
}
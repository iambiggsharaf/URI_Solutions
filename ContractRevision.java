import java.util.Scanner;




public class ContractRevision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char digit = '1';
        String myString = "1";
        
        while(digit != '0' && myString != "0"){
            digit = input.next().charAt(0);
            myString = input.next();

            boolean flag = false;
            char[] myArray = myString.toCharArray();
            
            myString = "";
            for(int i = 0; i < myArray.length; i++){
                if(myArray[i] == digit && i == 0){
                    flag = true;
                }
                else if(myArray[i] == digit){
                    continue;
                }
                else{
                    if(myArray[i] == '0' && flag == true){
                        continue;
                    }
                    else{
                        flag = false;
                        myString += myArray[i];
                    }
                }
            }
            if(myString.equals("") && (digit != '0' && myString != "0")){
                System.out.println(0);
            }
            else if(myString != ""){
                System.out.println(myString);
            }
            else{
                input.nextLine();
            }
        }
    }
}

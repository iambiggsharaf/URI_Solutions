import java.util.*;


public class Alliteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.nextLine();
            String[] myArray = myString.split(" ");
            int cnt = 0;
            boolean flag = false;
            for(int i = 0; i < myArray.length - 1; i++){
                if(myArray[i].substring(0, 1).equalsIgnoreCase(myArray[i + 1].substring(0, 1)) && flag == false){
                    cnt++;
                    flag = true;
                }
                else if (! myArray[i].substring(0, 1).equalsIgnoreCase(myArray[i + 1].substring(0, 1)) && flag == true){
                    flag = false;
                }
            }
            System.out.println(cnt);
        }
    }
}

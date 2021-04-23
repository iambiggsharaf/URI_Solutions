import java.util.*;

public class MultipleReading{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String myString = input.next();
            double procs = input.nextDouble();
            input.nextLine();
            int cnt = 0;
            double r = 0;
            char[] myArray = myString.toCharArray();
            for(int i = 0; i < myArray.length; i++){
                if(myArray[i] == 'W'){
                    cnt++;
                    cnt += Math.ceil(r / procs);
                    r = 0;
                }
                else if(myArray[i] == 'R' && i == myArray.length - 1){
                    r++;
                    cnt += Math.ceil(r / procs);
                }
                else{
                    r++;
                }
            }
            System.out.println(cnt);
        }
    }
}

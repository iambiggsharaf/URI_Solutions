import java.util.*;

public class DifferentDigits {

    public static boolean isGoodNumber(int number) {
        String s = String.valueOf(number);
        char[] myArray = s.toCharArray();
        boolean flag = true;
        for(int i = 0; i < myArray.length; i++){
            for(int j = i + 1; j < myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){
            int N = input.nextInt();
            int M = input.nextInt();
            int cnt = 0;
            for(int i = N; i <= M; i++){
                if(isGoodNumber(i) == true){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

import java.util.*;

public class RobotInstructions {

    public static int check(String[] myArray, String s) {
        
        if(s.equals("LEFT")){
            return -1;
        }
        else if(s.equals("RIGHT")){
            return 1;
        }
        else{
            String[] tempArr = s.split(" ");
            int ans = Integer.parseInt(tempArr[2]);
            return check(myArray ,myArray[ans - 1]);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0 ; i < T; i++){

            int N = input.nextInt();
            input.nextLine();
            int cnt = 0;
            String[] myArray = new String[N];

            for(int j = 0; j < N; j++){
                myArray[j] = input.nextLine();
            }

            for(int j = 0; j < N; j++){
                cnt += check(myArray, myArray[j]);
            }

            System.out.println(cnt);
            
        }
    }
}

import java.util.*;

public class LaserSculpture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){

            int A = input.nextInt();
            int C = input.nextInt();

            if(A == 0){
                break;
            }

            int[] myArray = new int[C];

            for(int i = 0; i < C; i++){
                myArray[i] = input.nextInt();
            }

            int cnt = A - myArray[0];

            for(int i = 1; i < C; i++){
                if(myArray[i] < myArray[i - 1]){
                    cnt += (myArray[i - 1] - myArray[i]);
                }
            }

            System.out.println(cnt);

        }
    }
}

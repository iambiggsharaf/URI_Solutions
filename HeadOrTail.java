import java.util.*;

public class HeadOrTail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){

            int N = input.nextInt();

            if(N == 0){
                break;
            }

            int mary = 0;
            int john = 0;

            for(int i = 0; i < N; i++){

                int temp = input.nextInt();
                if(temp == 0){
                    mary++;
                }
                else{
                    john++;
                }
            }

            System.out.println("Mary won " + mary + " times and John won " + john +" times");

        }
    }
}

23
23 F 28 M 23 F 40 M 36 F 23 M 23 F 24 M 23 M
28
22 M 23 F 28 M 32 F
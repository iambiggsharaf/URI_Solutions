import java.util.Scanner;

/**
 * MusicalLoop
 */
public class MusicalLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int N = input.nextInt();
            if(N == 0){
                break;
            }
            int[] myArray = new int[N];
            for(int i = 0; i < N; i++){
                myArray[i] = input.nextInt();
            }
            int cnt = 0;
            for(int i = 0; i < N; i++){
                if(myArray[(i + 1) % N] > myArray[i] && myArray[(i + 1) % N] > myArray[(i + 2) % N]){
                    cnt++;
                }
                if(myArray[(i + 1) % N] < myArray[i] && myArray[(i + 1) % N] < myArray[(i + 2) % N]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
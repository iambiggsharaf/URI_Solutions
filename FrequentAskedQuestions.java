import java.util.*;

public class FrequentAskedQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            int N = input.nextInt();
            int K = input.nextInt();
            int cnt = 0;

            if(N == 0){
                break;
            } 

            int[] counters = new int[101];

            for(int i = 0; i < N; i++){
                counters[input.nextInt()]++;
            }

            for(int i = 0; i < 101; i++){
                if(counters[i] >= K){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}

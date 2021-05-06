import java.util.*;


public class FakeTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            while(true){
                int N = input.nextInt();
                int M = input.nextInt();
                if(N == 0  && M == 0){
                    break;
                }
                int[] counter = new int[N + 1];
                for(int i = 0; i < M; i++){
                    counter[input.nextInt()]++;
                }
                int cnt = 0;
                for(int i = 0; i < N + 1; i++){
                    if(counter[i] > 1){
                        cnt ++;
                    }
                }
                System.out.println(cnt);

            }
            
        }
    }


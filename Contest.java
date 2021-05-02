import java.io.InputStreamReader;
import java.util.*;

public class Contest {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        while(true){
            int N = input.nextInt();
            int M = input.nextInt();
            if(N == 0){
                break;
            }

            int characteristics = 0;
    
            boolean nobodySolvedAllTheProblems = true;
            for(int i = 0; i < N; i++){
                int sum = 0;
                for(int j = 0; j < M; j++){
                    sum += j;
                }
                if(sum == M){
                    nobodySolvedAllTheProblems = false;
                }
            }

            boolean everyProblemWasSolvedByAtLeastOnePerson = true;
            for(int i = 0; i < M; i++){
                int sum = 0;
                for(int j = 0; j < N; j++){
                    if()
                }
            }
        }
    }
}

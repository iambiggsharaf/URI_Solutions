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
            // defining a 2D Array
            int[][] myArray = new int[N][M];

            // Assigning Values to 2D Array
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    myArray[i][j] = input.nextInt();
                }
            }

            //defining a counter of properties
            int properties = 4;

            //1.Nobody solved all the problems.
            int oneHoriCnt = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    oneHoriCnt += myArray[i][j];
                }
                if(oneHoriCnt == M){
                    properties --;
                    break;
                }
                else{
                    oneHoriCnt = 0;
                }
            }

            //2.Every problem was solved by at least one person
            int zeroCnt = 0;
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(myArray[j][i] == 0){
                        zeroCnt++;
                    }
                }
                if(zeroCnt == N){
                    properties--;
                    break;
                }
                else{
                    zeroCnt = 0;
                }
            }

            //3.There is no problem solved by everyone.
            int oneVertiCnt = 0;
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(myArray[j][i] == 1){
                        oneVertiCnt++;
                    }
                }
                if(oneVertiCnt == N){
                    properties--;
                    break;
                } 
                else{
                    oneVertiCnt = 0;
                }
            }

            //4. Everyone solved at least one problem
            int zeroHoriCnt = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(myArray[i][j] == 0){
                        zeroHoriCnt++;
                    }
                }
                if(zeroHoriCnt == M){
                    properties--;
                    break;
                }
                else{
                    zeroHoriCnt = 0;
                }
            }

            System.out.println(properties);

        }
    }
}

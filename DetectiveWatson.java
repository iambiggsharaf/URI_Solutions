import java.util.*;
public class DetectiveWatson {
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
            int[] initialArray = myArray.clone();

            Arrays.sort(myArray);
            
            int ans = myArray[N - 2];

            for(int i = 0; i < N; i ++){
                if(initialArray[i] == ans){
                    System.out.println(i + 1);
                }
            }

        }

    }
}


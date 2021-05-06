import java.util.*;

public class LostBoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){
            int N = input.nextInt();
            int[] leftArray = new int[31];
            int[] rightArray = new int[31];
            for(int i = 0; i < N; i++){
                int size = input.nextInt();
                String foot = input.next();

                if(foot.equals("D")){
                    rightArray[size - 30]++;
                }
                else{
                    leftArray[size - 30]++;
                }
            }
            int pairs = 0;
            for(int i = 0; i < 31; i++){
                pairs += Math.min(leftArray[i], rightArray[i]);
            }
            System.out.println(pairs);
            
        }

    }
}

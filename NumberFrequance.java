import java.util.*;


public class NumberFrequance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myArrayOfCounters[] = new int[2001];
        int N = input.nextInt();
        for(int i = 0; i < N; i++){
            int num = input.nextInt();
            myArrayOfCounters[num] ++;
        }
        for(int i = 0; i < 2001; i++){
            if(myArrayOfCounters[i] > 0){
                System.out.println(i + " aparece " + myArrayOfCounters[i] + " vez(es)");
            }
        }
        System.out.println(9 & 8);
    }
}

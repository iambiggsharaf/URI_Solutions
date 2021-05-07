import java.util.*;

public class PowerCrisis {

    public static int josephus(int n, int k) {
        if(n==1){
            return 1;
        }
        else{
            return (josephus(n-1,k)+k-1)%n+1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int N = input.nextInt();
            if(N == 0){
                break;
            }

            int m = 2;
            while(true){
                if(josephus(N - 1, m) == 12){
                    break;
                }
                else{
                    m++;
                }
            }
            System.out.println(m);

        }


    }
}

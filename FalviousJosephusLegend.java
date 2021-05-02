import java.util.*;

/**
 * FalviousJosephusLegend
 */
public class FalviousJosephusLegend {


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
        int numTest = input.nextInt();
        

        for(int i = 0; i < numTest; i++){
            int numPeople = input.nextInt();
            int numSteps = input.nextInt();
            System.out.println("Case " + (i + 1) + ": " + josephus(numPeople, numSteps));

        }
    }
}

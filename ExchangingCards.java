import java.util.*;

public class ExchangingCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int A = input.nextInt();
            int B = input.nextInt();
            if(A == 0 && B == 0){
                break;
            }
            HashSet<Integer> setA = new HashSet<Integer>();
            HashSet<Integer> setB = new HashSet<Integer>();
            for(int i = 0; i < A; i++){
                setA.add(input.nextInt());
            }
            for(int i = 0; i < B; i++){
                setB.add(input.nextInt());
            }
            int cntA = 0;
            int cntB = 0;
            for(int i : setA){
                if(!setB.contains(i)){
                    cntA++;
                }
            }
            for(int i : setB){
                if(!setA.contains(i)){
                    cntB++;
                }
            }
            System.out.println(Math.min(cntA, cntB));
        }
    }
}

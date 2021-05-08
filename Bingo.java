import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            int N = input.nextInt();
            int B = input.nextInt();

            if(N == 0){
                break;
            }

            HashSet<Integer> mySet = new HashSet<Integer>();
            int[] myArray = new int[B];

            for(int i = 0; i < B; i++){
                myArray[i] = input.nextInt();
                mySet.add(myArray[i]);
            }

            for(int i = 0; i < B; i++){
                for(int j = i + 1; j < B; j++){
                    mySet.add(Math.abs(myArray[i] - myArray[j]));
                }
            }

            boolean flag = true;

            for(int i = 0; i <= N; i++){
                if(!mySet.contains(i)){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }

        }
    }
}

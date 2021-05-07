import java.util.*;

public class SumOfTwoSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int n = input.nextInt();
            int root = (int) Math.sqrt(n);
            
            boolean flag = false;
            for(int i = 0; i <= root; i++){
                int temp = n - (i * i);
                if(Math.sqrt(temp) == (int) Math.sqrt(temp)){
                    flag = true;
                }
            }
            if(flag == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}


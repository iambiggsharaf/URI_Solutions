import java.util.*;

/**
 * CountingSheep
 */
public class CountingSheep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0; i < T; i++){
            int N = input.nextInt();
            HashSet<Integer> sheep = new HashSet<Integer>();
            for(int j = 0; j < N; j++){
                sheep.add(input.nextInt());
            }
            System.out.println(sheep.size());
        }
    }
}
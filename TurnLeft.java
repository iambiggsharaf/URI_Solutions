import java.util.*;


public class TurnLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            int N = input.nextInt();
            input.nextLine();
            if(N == 0){
                break;
            }
            String myString = input.nextLine();
            char[] myArray = myString.toCharArray();
            char[] directionsForRight = {'N', 'L', 'S', 'O'};
            char[] directionsForLeft = {'N', 'O', 'S', 'L'};
            int left = 0;
            int right = 0;
            for(char i : myArray){
                if(i == 'D'){
                    right++;
                }
                else{
                    left++;
                }
            }
            if(right >= left){
                int rotations = right - left;
                rotations %= 4;
                System.out.println(directionsForRight[rotations]);
            }
            else{
                int rotations = left - right;
                rotations %= 4;
                System.out.println(directionsForLeft[rotations]);
            }
        }
    }
}

import java.util.*;

public class DietPlan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        for(int i = 0; i < numTests; i++){
            String diet = input.next();
            String breakfast = input.next();
            String lunch = input.next();
            lunch += breakfast;
            char[] lunchFood = lunch.toCharArray();
            lunch = "";
            for(int j = 0; j < lunchFood.length; j++){
                if(diet.contains(String.valueOf(lunchFood[j]))){
                    
                }
            }
            
        }
    }
}
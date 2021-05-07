import java.util.*;

public class HoursAndMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int t = input.nextInt();
            if(t % 6 == 0){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
    }
}

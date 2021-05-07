import java.util.*;


public class AutomatedCheckingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] first = new int[5];
        int[] second = new int[5];
        boolean flag = true;
        for(int i = 0; i < 5; i++){
            first[i] = input.nextInt();
        }
        for(int i = 0; i < 5; i++){
            second[i] = input.nextInt();
        }
        for(int i = 0; i < 5; i++){
            if(first[i] + second[i] != 1){
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

import java.util.*;

/**
 * Queen
 */
public class Queen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            if(x1 == 0){
                break;
            }

            if(x1 == x2 && y1 == y2){
                System.out.println(0);
            }

            else if(x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)){
                System.out.println(1);
            }        

            else{
                System.out.println(2);
            }
    }
}
}
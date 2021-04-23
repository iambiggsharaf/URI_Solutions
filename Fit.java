import java.lang.Math;
import java.util.Scanner;



public class Fit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++){
            String a = input.next();
            String b = input.next();
            if(a.endsWith(b) == true){
                System.out.println("encaixa");
            }
            else{
                System.out.println("nao encaixa");
            }
        }
    }
}

import java.util.*;

public class Colision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int i = 0; i < T; i++){

            int ax, ay, bx, by, cx, cy, dx, dy, rx, ry;

            ax = input.nextInt();
            ay = input.nextInt();
            bx = input.nextInt();
            by = input.nextInt();
            cx = input.nextInt();
            cy = input.nextInt();
            dx = input.nextInt();
            dy = input.nextInt();
            rx = input.nextInt();
            ry = input.nextInt();

            if(rx >= ax && rx <= bx && rx >= dx && rx <= cx && ry >= ay && ry <= dy && ry >= by && ry <= cy){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }

        }

    }
}

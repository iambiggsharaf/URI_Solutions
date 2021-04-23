import java.util.*;


public class Bacteria1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String a = input.nextLine();
            String b = input.nextLine();
            if(a.contains(b)){
                System.out.println("Resistente");
            }
            else{
                System.out.println("Nao resistente");
            }
        }
    }
}

import java.util.*;


public class PocemonCollection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numPokemons = input.nextInt();
        input.nextLine();

        Set<String> mySet = new HashSet<String>();
        for(int i = 0; i < numPokemons; i++){
            mySet.add(input.nextLine());
        }
        
        System.out.println("Falta(m) " + (151 - mySet.size()) + " pomekon(s).");
    }
}

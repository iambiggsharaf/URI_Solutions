import java.util.*;

/**
 * FalviousJosephusLegend
 */
public class FalviousJosephusLegend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();
        int numPeople = input.nextInt();
        int numSteps = input.nextInt();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i <= numPeople; i++){
            myArray.add(i);
        }

        int i = 1;
        while(myArray.size() > 1){
            if(i % myArray.size() == numSteps){
                System.out.println(myArray.get(i % myArray.size() - 1));
                myArray.remove(i % myArray.size() - 1);
            }
            if(myArray.size() == 1){
                break;
            }
            i++;

            // System.out.println("Salom");
            // break;
        }
        System.out.println(myArray.get(0));
    }
}

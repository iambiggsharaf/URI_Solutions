import java.util.*;

public class InternationalChat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        for(int i = 0; i < numTests; i++){

            int numLines = input.nextInt();
            List<String> myArray = new ArrayList<String>();

            for(int j = 0;j < numLines; j++){
                String myString = input.next();
                myArray.add(myString);
            }
            boolean flag = false;
            for(int j = 0; j < myArray.size() - 1; j++){
                if(! myArray.get(j).equals(myArray.get(j + 1))){
                    flag = true;
                    // System.out.println("Dromad");
                }
            }
            // System.out.println(myArray);
            if(flag == true){
                System.out.println("ingles");
            }
            else{
                System.out.println(myArray.get(0));
            }
        }
    }
}

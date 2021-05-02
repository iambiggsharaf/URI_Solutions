import java.util.*;


public class GetlineThreeShoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = 1;
        while(input.hasNextLine()){

            String N = input.nextLine();
            String[] myArray = input.nextLine().split(" ");

            int f = 0;
            int m = 0;
            int cnt = 0;

            for(int i = 0; i < myArray.length; i += 2){
                if(myArray[i].equals(N)){
                    
                    cnt++;
                    
                    if(myArray[i + 1].equals("F")){
                        f++;
                    }
                    else if(myArray[i + 1].equals("M")){
                        m++;
                    }
                }
            }
            
            if(testCase != 1){
                System.out.println("\n");
            }

            System.out.println("Caso " + testCase + ":");
            System.out.println("Pares Iguais: " + cnt);
            System.out.println("F: " + f);
            System.out.print("M: " + m );


            testCase ++;
            if(N.equals("0")){
                break;
            }

        }
        System.out.println();
    }
}

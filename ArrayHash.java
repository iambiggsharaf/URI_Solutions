import java.util.Scanner;


public class ArrayHash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();

        for(int i = 0; i < numTests; i++){
            int numLines = input.nextInt();
            int cnt = 0;

            for(int j = 0; j < numLines; j ++){
                String myString = input.next();
                char[] myArray = myString.toCharArray();
                for(int k = 0; k < myArray.length; k++){
                    cnt += myArray[k] - 65;
                    cnt += k;
                    cnt += j;
                }
            }
            System.out.println(cnt);
        }
    }
}

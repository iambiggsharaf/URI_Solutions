import java.util.*;

public class ShortStoryCompetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int numWords = input.nextInt();
            double numLines = input.nextInt();
            int numChars = input.nextInt();
            input.nextLine();
            // int max_char_counter = 0;
            double lines = 1;
            int pages = 0;
            String myString = input.nextLine();
            String[] myArray = myString.split(" ");
            for(String i : myArray){
                if(i.length() + max_char_counter <= numChars){
                    max_char_counter += i.length() + 1;
                }
                else{
                    max_char_counter = 0;
                    max_char_counter += i.length() + 1;
                    lines += 1;
                }
            }
            int ans = (int) Math.ceil(lines / numLines);
            System.out.println(ans);
        }
    }
}

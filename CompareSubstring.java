import java.nio.charset.MalformedInputException;
import java.util.*;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String fisrtString = input.nextLine();
            String secondString = input.nextLine();
            int minLength, maxSubString;
            String max, min;
            if(fisrtString.length() <= secondString.length()){
                minLength = fisrtString.length();
                maxSubString = fisrtString.length();
                min = fisrtString;
                max = secondString;
            }
            else{
                minLength = secondString.length();
                maxSubString = secondString.length();
                min = secondString;
                max = fisrtString;
            }
            boolean foundSubString = false;

            while(maxSubString > 0 && foundSubString == false){
                int steps = minLength - maxSubString; // amount of possible SubStrings in Min String
                for(int i = 0; i <= steps; i ++){
                    if(max.contains(min.substring(i, i + maxSubString))){
                        foundSubString = true;
                        maxSubString++;
                        break;
                    }
                }
                maxSubString--;
            }
            System.out.println(maxSubString);
        }
    }
}

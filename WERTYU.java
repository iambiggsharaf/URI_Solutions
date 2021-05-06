import java.util.*;
public class WERTYU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String s = input.nextLine();
            String ans = "";
            String keybord = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
            char[] base = keybord.toCharArray();
            
            char[] outString = s.toCharArray();
            for(int i = 0; i < outString.length; i++){
                if(outString[i] == ' '){
                    System.out.print(" ");
                }
                else{
                    System.out.print(base[keybord.indexOf(outString[i]) - 1]);
                }
                 
            }
            System.out.print("\n");

        }

        
    }
}
    
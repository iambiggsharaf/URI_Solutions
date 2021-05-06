import java.util.*;


public class OpticalReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int N = input.nextInt();
            if(N == 0){
                break;
            }
            for(int i = 0; i < N; i++){
                int[] myArray = new int[5];
                int cnt = 0;
                for(int j = 0; j < 5; j++){
                    myArray[j] = input.nextInt();
                    if(myArray[j] <= 127){
                        cnt++;
                    }
                }
                if(cnt == 1){
                    for(int j = 0; j < 5; j++){
                        if(myArray[j] <= 127){
                            System.out.println((char) (j + 65));
                        }
                    }
                }
                else{
                    System.out.println('*');
                }
            }
        }
    }
}

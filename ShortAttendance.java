import java.util.*;


public class ShortAttendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        for(int i = 0; i < numTests; i++){
            int numStudents = input.nextInt();
            input.nextLine();
            String myString = input.nextLine();
            String myString2 = input.nextLine();
            String[] arrayOfStudents = myString.split(" ");
            String[] arrayOfAttendance = myString2.split(" ");
            String badStudents = "";
            for(int j = 0; j < arrayOfAttendance.length; j++){
                double absent = 0;
                double attendance = 0;
                
                char[] myArray = arrayOfAttendance[j].toCharArray();
                for(int k = 0; k < myArray.length; k++){
                    if(myArray[k] == 'A'){
                        attendance++;
                        absent++;
                    }
                    if(myArray[k] == 'P'){
                        attendance++;
                    }
                }
                double ans = (100/attendance) * absent;
                if(ans > 25){
                    badStudents += arrayOfStudents[j] + " ";
                }
            }
            if(! badStudents.equals("")){
                System.out.println(badStudents.substring(0, badStudents.length() - 1));
            }
            else{
                System.out.print('\n');
            }
            
        }
    }
}

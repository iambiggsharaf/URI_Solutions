import java.util.*;


public class GetlineTwoFuits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalKg = 0;
        double totalMoney = 0;

        int numDays = input.nextInt();
    
        for(int i = 0; i < numDays; i++){

            double thisDayMoney = input.nextDouble();
            totalMoney += thisDayMoney;
            input.nextLine();

            String[] fruits = input.nextLine().split(" ");
            totalKg += fruits.length;

            System.out.println("day " + (i + 1) + ": " + fruits.length + " kg");
        }

        System.out.printf("%.2f", (totalKg / numDays));
        System.out.println(" kg by day");
        System.out.print("R$ ");
        System.out.printf("%.2f", (totalMoney / numDays)); 
        System.out.println(" by day");
    }
}

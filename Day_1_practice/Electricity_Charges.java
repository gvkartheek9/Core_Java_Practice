import java.util.Scanner;

public class Electricity_Charges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double billAmount = 0.0;

        if (units <= 50) {
            billAmount = units * 0.50;
        } else if (units <= 150) {
            billAmount = (50*0.50)+ (units - 50) * 0.75;
        } else if (units <= 250) {
            billAmount = (50*0.50)+(100*0.75) + (units - 150) * 1.20;
        } else {
            billAmount = (50*0.50)+(100*0.75)+(100*1.20) + (units - 250) * 1.50;
        }
        billAmount+=billAmount*0.2;
        System.out.println("The total electricity bill amount is: Rs. " + billAmount);

        scanner.close();
    }
}

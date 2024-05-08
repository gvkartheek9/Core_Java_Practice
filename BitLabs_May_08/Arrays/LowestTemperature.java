import java.util.Scanner;

public class LowestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of days: ");
        int numOfDays = scanner.nextInt();
        double[] temperatures = new double[numOfDays];
        for (int i = 0; i < numOfDays; i++) {
            System.out.println("Enter the temperature of Day " + (i + 1) + ":");
            temperatures[i] = scanner.nextDouble();
        }
        double lowestTemperature = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }
        System.out.println("The lowest temperature of the week " + numOfDays + " is " + lowestTemperature + " celsius.");
    }
}

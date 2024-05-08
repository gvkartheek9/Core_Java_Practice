import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total marks obtained: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter maximum marks possible: ");
        double maxMarks = scanner.nextDouble();
        if (totalMarks < 0 || maxMarks <= 0 || totalMarks > maxMarks) {
            System.out.println("Invalid input. Please enter positive values for marks where total marks cannot exceed maximum marks.");
            return;
        }

        double percentage = (totalMarks / maxMarks) * 100;

        percentage = Math.round(percentage * 10) / 10.0;  // Round to one decimal place
        System.out.printf("Percentage: %.1f%%\n", percentage);
    }
}

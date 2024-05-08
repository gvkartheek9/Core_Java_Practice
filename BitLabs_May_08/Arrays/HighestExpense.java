import java.util.Scanner;

public class HighestExpense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] expenses = new double[10];

        System.out.println("Enter your 10 expenses for this month:");
        for (int i = 0; i < 10; i++) {
            expenses[i] = scanner.nextDouble();
        }
        double highestExpense = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > highestExpense) {
                highestExpense = expenses[i];
            }
        }
        System.out.println("The highest price you incurred is " + highestExpense + ".");
    }
}

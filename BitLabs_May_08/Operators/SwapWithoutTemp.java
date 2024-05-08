import java.util.Scanner;

public class SwapWithoutTemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Print before swapping
        System.out.println("Before swapping: " + num1 + " , " + num2);

        // Swap using XOR (exclusive OR) operation
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        // Print after swapping
        System.out.println("After swapping: " + num1 + " , " + num2);
    }
}

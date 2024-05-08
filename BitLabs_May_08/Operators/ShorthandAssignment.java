import java.util.Scanner;

public class ShorthandAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a and b
        System.out.print("Enter first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter second value: ");
        int b = scanner.nextInt();

        // Shorthand assignment operations and print results
        System.out.println("a *= b is: " + (a *= b));  // Multiply and assign back to a
        System.out.println("a -= b is: " + (a -= b));  // Subtract and assign back to a
        System.out.println("a /= b is: " + (a /= b));  // Divide and assign back to a
        System.out.println("a %= b is: " + (a %= b));  // Modulo and assign back to a

        // Sum without + operator
        int sum = a + (b - a);  // Leverage subtraction to avoid +
        System.out.println("\nThe sum of two numbers is: " + sum);
    }
}

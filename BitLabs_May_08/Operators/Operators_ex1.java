import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Difference of 2 numbers
        System.out.print("Enter first number for difference: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number for difference: ");
        int num2 = scanner.nextInt();
        int difference = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + difference);

        // 2. Product of 2 numbers
        System.out.print("Enter first number for product: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number for product: ");
        num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        // 3. Division of 2 numbers 
        System.out.print("Enter first number for division: ");
        double numDouble1 = scanner.nextDouble();
        System.out.print("Enter second number for division: ");
        double numDouble2 = scanner.nextDouble();
        double quotient = numDouble1 / numDouble2;
        System.out.println("Division of " + numDouble1 + " and " + numDouble2 + " is: " + quotient);

        // 4. Increment and Decrement the number
        System.out.print("Enter a number for increment/decrement: ");
        int num = scanner.nextInt();
        int incremented = num + 1;
        int decremented = num - 1;
        System.out.println("Incremented value of " + num + " is: " + incremented);
        System.out.println("Decremented value of " + num + " is: " + decremented);

        // 5. Remainder of 2 numbers
        System.out.print("Enter first number for remainder: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number for remainder: ");
        num2 = scanner.nextInt();
        int remainder = num1 % num2;
        System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + remainder);
    }
}

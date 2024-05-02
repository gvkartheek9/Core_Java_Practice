import java.util.*;


public class PowerOfNumberUsingForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (non-negative): ");
        int exponent = scanner.nextInt();
        if (exponent < 0) {
            System.out.println("Error: Exponent must be non-negative.");
            return;
        }

        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

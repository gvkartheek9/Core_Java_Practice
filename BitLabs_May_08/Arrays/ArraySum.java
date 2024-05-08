import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter the 10 elements:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of array elements is " + sum + ".");
    }
}

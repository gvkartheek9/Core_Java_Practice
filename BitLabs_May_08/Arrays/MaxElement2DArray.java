import java.util.Scanner;

public class MaxElement2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int maxElement = arr[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Largest element in array is " + maxElement + " and its index position is arr[" + maxRow + "][" + maxColumn + "].");
    }
}

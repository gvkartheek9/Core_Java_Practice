public class AlphabetPattern {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            char startChar = 'a';  

            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print first half of the pattern 
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (startChar + j - 1) + " ");
            }

            for (int j = i - 1; j > 0; j--) {
                System.out.print((char) (startChar + j - 1) + " ");
            }

            System.out.println();  // Move to the next line
        }
    }
}

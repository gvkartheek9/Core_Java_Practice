import java.util.Scanner;


public class NumberInWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String singleDigits[] = {"zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Enter a number (1-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Invalid number. Please enter a number between 1 and 999.");
            return;
        }

        String numberInWords = "";

        // Handle hundreds
        if (number >= 100) {
            numberInWords = singleDigits[number / 100] + " Hundred";
            number %= 100; // Get remaining number (tens and units)
        }

        // Handle tens and units (including teens)
        if (number > 0) {
            if (number >= 11 && number < 20) { // Check for teens first
                String[] teenNumbers = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
                numberInWords += (numberInWords.isEmpty() ? "" : " ") + teenNumbers[number % 10];
            } else if (number >= 20) {
                String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
                numberInWords += (numberInWords.isEmpty() ? "" : " ") + tens[number / 10]; // Extract tens digit
                number %= 10; // Get remaining unit digit

                // Handle remaining unit digit (except 0)
                if (number > 0) {
                    numberInWords += " " + singleDigits[number];
                }
            }
        }

        System.out.println("Number in words: " + numberInWords);
    }
}

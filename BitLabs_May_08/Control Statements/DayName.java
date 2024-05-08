import java.util.Scanner;

public class DayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for day number
        System.out.print("Enter a number between 1 and 7 for day of the week: ");
        int dayNum = scanner.nextInt();

        String dayName;
        switch (dayNum) {
            case 1:
                   System.out.println("Monday");
                     break;
            case 2:
                   System.out.println("Tuesday");
                     break;
            case 3:
                  System.out.println("Wednesday");
                     break;
            case 4:
                  System.out.println("Thursday");
                     break;
            case 5:
                  System.out.println("Friday");
                     break;
           case 6:
                  System.out.println("Saturday");
                     break;
           case 7:
                  System.out.println("Sunday");
                     break;
           default:
                   System.out.println("Invalid Input")
      }
   }

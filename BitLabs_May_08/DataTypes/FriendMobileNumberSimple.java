import java.util.Scanner;

public class FriendMobileNumberSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your friend's mobile number (10 digits): ");
        String mobileNum = scanner.nextLine();
        String lastFourDigits = mobileNum.substring(mobileNum.length() - 4);
        System.out.println("Your friend's mobile number ends with ******" + lastFourDigits);
    }
}

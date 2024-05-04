import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();

        while (true) {
            System.out.println("Welcome to your Shopping Cart!");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Print cart");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter item name: ");
                    String item = scanner.next();
                    cart.add(item);
                    System.out.println(item + " added to cart!");
                    break;
                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.println("Enter item name to remove: ");
                        String itemToRemove = scanner.next();
                        if (cart.contains(itemToRemove)) {
                            cart.remove(itemToRemove);
                            System.out.println(itemToRemove + " removed from cart!");
                        } else {
                            System.out.println(itemToRemove + " not found in cart!");
                        }
                    }
                    break;
                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.println("Your cart items:");
                        for (String itm : cart) {
                            System.out.println(itm);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting shopping cart!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

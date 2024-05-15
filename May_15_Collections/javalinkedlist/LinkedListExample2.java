package javalinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> cart = new LinkedList<>();

        System.out.println("Welcome to your Shopping Cart!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Print cart items");
            System.out.println("4. Checkout (exit)");
            System.out.print("Enter your choice: ");

            //when I am taking the scanner.nextInt() in the console it is taking the
            // integer park and leaving the nextline character .
            //if I am taking the another input then the only the scanner object
            //only takes the /n and showing blank
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter item name to add: ");
                    String item = scanner.nextLine();
                    cart.add(item);
                    System.out.println(item + " added to cart!");
                    break;
                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        System.out.print("Enter item name to remove: ");
                        item = scanner.nextLine();
                        if (cart.remove(item)) {
                            System.out.println(item + " removed from cart!");
                        } else {
                            System.out.println("Item not found in cart!");
                        }
                    }
                    break;
                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        System.out.println("Cart Items:");
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println(i + 1 + ". " + cart.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

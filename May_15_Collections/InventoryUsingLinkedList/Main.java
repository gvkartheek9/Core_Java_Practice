package InventoryUsingLinkedList;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Shirt", 19.99, 10));
        inventory.addProduct(new Product("Jeans", 39.95, 5));
        inventory.addProduct(new Product("Hat", 14.50, 8));

        inventory.displayInventory(); // Display initial inventory

        inventory.removeProduct("Jeans");
        inventory.updateProductQuantity("Shirt", 15);

        inventory.displayInventory(); // Display inventory after modifications
    }
}

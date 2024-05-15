package InventoryUsingLinkedList;

import java.util.LinkedList;

public class Inventory {

    private LinkedList<Product> products;

    public Inventory() {
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) {
    for (Product existingProduct : products) {
      if (existingProduct.getName().equals(product.getName())) {
        System.out.println("Product " + product.getName() + " already exists in inventory.");
        return;
      }
    }
        products.add(product);
    }

    public void removeProduct(String productName) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product " + productName + " removed from inventory.");
        } else {
            System.out.println("Product " + productName + " not found in inventory.");
        }
    }

    public Product searchProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public void updateProductQuantity(String productName, int newQuantity) {
        Product productToUpdate = searchProduct(productName);
        if (productToUpdate != null) {
            productToUpdate.setQuantity(newQuantity); // Assuming a setter method for quantity (optional)
            System.out.println("Product " + productName + " quantity updated to " + newQuantity);
        } else {
            System.out.println("Product " + productName + " not found in inventory.");
        }
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}

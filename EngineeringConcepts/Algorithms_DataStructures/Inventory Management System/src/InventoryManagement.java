import java.util.HashMap;

public class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added successfully.");
    }

    // Update product
    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display products
    public void displayInventory() {
        for (Product product : inventory.values()) {
            product.display();
        }
    }
}
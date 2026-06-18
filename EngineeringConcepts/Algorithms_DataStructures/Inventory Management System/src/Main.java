public class Main {
    public static void main(String[] args) {

        InventoryManagement inventory = new InventoryManagement();

        Product p1 = new Product(101, "Laptop", 20, 50000);
        Product p2 = new Product(102, "Mouse", 100, 500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        inventory.updateProduct(101, 25, 52000);

        inventory.deleteProduct(102);

        inventory.displayInventory();
    }
}
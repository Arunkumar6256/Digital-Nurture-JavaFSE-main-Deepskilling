public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Tablet", "Electronics")
        };

        int targetId = 104;

        Product linearResult = linearSearch(products, targetId);
        if (linearResult != null) {
            System.out.println("Linear Search Result:");
            linearResult.display();
        } else {
            System.out.println("Product not found");
        }

        Product binaryResult = binarySearch(products, targetId);
        if (binaryResult != null) {
            System.out.println("Binary Search Result:");
            binaryResult.display();
        } else {
            System.out.println("Product not found");
        }
    }
}
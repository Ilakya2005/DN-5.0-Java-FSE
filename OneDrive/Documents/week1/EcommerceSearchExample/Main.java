package EcommerceSearchExample;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class Main {

    // Linear Search
    static void linearSearch(Product[] products, int key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == key) {
                System.out.println("Product Found: " + products[i].productName);
                return;
            }
        }
        System.out.println("Product Not Found");
    }

    // Binary Search
    static void binarySearch(Product[] products, int key) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == key) {
                System.out.println("Product Found: " + products[mid].productName);
                return;
            } else if (products[mid].productId < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Product Not Found");
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        int searchId = 104;

        System.out.println("Linear Search:");
        linearSearch(products, searchId);

        System.out.println();

        System.out.println("Binary Search:");
        binarySearch(products, searchId);
    }
}
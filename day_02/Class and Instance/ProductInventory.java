class Product {
    // Instance variables for product name and price
    private String productName;
    private double price;

    // Static variable to keep track of the total number of products created
    private static int totalProducts = 0;

    // Constructor to initialize product details and increment totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment the count whenever a new product is created
    }

    // Instance method to display details of a specific product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Static method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);

        // Displaying details of each product
        System.out.println("Details of Product 1:");
        product1.displayProductDetails();

        System.out.println("\nDetails of Product 2:");
        product2.displayProductDetails();

        // Displaying total number of products created
        System.out.println("\nSummary:");
        Product.displayTotalProducts();
    }
}

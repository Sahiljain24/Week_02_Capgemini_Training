/*Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
 */
import java.util.UUID; // Import UUID for generating unique IDs

// Class to represent a Product in the Shopping Cart System
public class Product {

    // Static variable for discount shared by all products
    private static double discount = 10;

    // Static method to reduce the discount percentage
    static void reduceDiscount(double value) {
        if (value > 0 && discount - value >= 0) {
            discount -= value;
            System.out.println("Discount reduced by " + value + "%. Current discount: " + discount + "%");
        } else {
            System.out.println("Invalid value. Discount cannot be negative.");
        }
    }

    // Static method to increase the discount percentage
    static void increaseDiscount(double value) {
        if (value > 0) {
            discount += value;
            System.out.println("Discount increased by " + value + "%. Current discount: " + discount + "%");
        } else {
            System.out.println("Invalid value. Increase value must be positive.");
        }
    }

    // Instance variables for product details
    private String productName; // Name of the product
    private int price;          // Price of the product
    private int quantity;       // Quantity of the product

    // Final variable for unique product ID
    private final String productID;

    // Constructor to initialize product details
    Product(String productName, int price, int quantity) {
        this.productName = productName; // Assign the product name
        this.price = price;            // Assign the price
        this.quantity = quantity;      // Assign the quantity
        this.productID = UUID.randomUUID().toString(); // Generate a unique product ID
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class to demonstrate the Product class
class ProductMain {
    public static void main(String[] args) {
        // Create a new Product object
        Product product1 = new Product("Laptop", 1000, 2);

        // Check if the object is an instance of Product
        if (product1 instanceof Product) {
            System.out.println("Processing details for Product:");
            product1.displayDetails();
        }

        // Update the discount
        Product.reduceDiscount(2);
        Product.increaseDiscount(5);

        // Create another Product object
        Product product2 = new Product("Smartphone", 700, 3);

        // Display details for the new product
        if (product2 instanceof Product) {
            System.out.println("\nProcessing details for another Product:");
            product2.displayDetails();
        }
    }
}

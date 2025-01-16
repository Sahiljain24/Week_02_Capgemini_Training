/*Question 5 :
Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart
Display the total cost.
 */
import java.util.ArrayList;

// Class to represent an item in the cart
class CartItem {
    private String itemName; // Name of the item
    private double price;    // Price of the item
    private int quantity;    // Quantity of the item

    // Constructor to initialize the CartItem object
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Getter for item name
    public String getItemName() {
        return itemName;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.printf("Item: %s, Price: %.2f, Quantity: %d, Total: %.2f\n",
                itemName, price, quantity, getTotalCost());
    }
}

// Class to represent the shopping cart
class ShoppingCart {
    private ArrayList<CartItem> cart; // List to store CartItem objects
    private double totalCost;         // Total cost of all items in the cart

    // Constructor to initialize the shopping cart
    ShoppingCart() {
        cart = new ArrayList<>();
        totalCost = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        totalCost += item.getTotalCost();
        System.out.println("Item added to the cart: " + itemName);
    }

    // Method to remove an item from the cart by name
    public void removeItem(String itemName) {
        boolean itemRemoved = false;

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemName().equalsIgnoreCase(itemName)) {
                totalCost -= cart.get(i).getTotalCost();
                cart.remove(i);
                System.out.println("Item removed from the cart: " + itemName);
                itemRemoved = true;
                break;
            }
        }

        if (!itemRemoved) {
            System.out.println("Item not found in the cart: " + itemName);
        }
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (CartItem item : cart) {
                item.displayItemDetails();
            }
            System.out.printf("Total Cost: %.2f\n", totalCost);
        }
    }
}

// Main class to test the ShoppingCart functionality
public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Apple", 1.5, 4);
        cart.addItem("Banana", 0.75, 6);
        cart.addItem("Orange", 1.25, 3);

        // Display the cart
        cart.displayCart();

        // Remove an item from the cart
        cart.removeItem("Banana");

        // Display the cart after removal
        cart.displayCart();

        // Attempt to remove an item not in the cart
        cart.removeItem("Grapes");
    }
}

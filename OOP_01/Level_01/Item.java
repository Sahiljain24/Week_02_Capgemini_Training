/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
 */
// Class to represent an Item
public class Item {
    
    // Private attributes to store item details
    private int itemCode;  // Unique code for the item
    private String itemName; // Name of the item
    private double price;  // Price of the item

    // Constructor to initialize the attributes of the Item
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;  // Assign itemCode
        this.itemName = itemName;  // Assign itemName
        this.price = price;        // Assign price
    }

    // Method to display the details of the item
    public void displayItemDetails() {
        // Print item details using formatted output
        System.out.printf(
            "ItemCode is %d, Item name is %s and the price of the item is %.2f\n", 
            itemCode, itemName, price
        );
    }
}

// Main class to test the Item class
class ItemMain {
    public static void main(String[] args) {
        // Create an Item object with specific details
        Item item = new Item(15, "Coffee", 50);

        // Display the details of the item
        item.displayItemDetails();
    }
}

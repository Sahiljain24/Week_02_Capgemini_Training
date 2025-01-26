// Abstract Class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate the total price of the item
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getter and Setter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Interface Discountable
interface Discountable {
    double applyDiscount();  // Method to apply discount
    String getDiscountDetails();  // Method to get discount details
}

// Class VegItem extends FoodItem
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding the abstract method calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementing applyDiscount and getDiscountDetails methods
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;  // 10% discount on veg items
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied to Veg Item";
    }
}

// Class NonVegItem extends FoodItem
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding the abstract method calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50;  // Additional charge for non-veg items
    }

    // Implementing applyDiscount and getDiscountDetails methods
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;  // 5% discount on non-veg items
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied to Non-Veg Item";
    }
}

// OrderProcessing class to demonstrate polymorphism and handle different food items
class OrderProcessing {
    public void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        double totalPrice = item.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        // Check if the item is discountable and apply discount
        if (item instanceof Discountable) {
            Discountable discountableItem = (Discountable) item;
            double discount = discountableItem.applyDiscount();
            System.out.println("Discount: " + discount);
            System.out.println(discountableItem.getDiscountDetails());
            totalPrice -= discount;
        }

        System.out.println("Final Price after Discount: " + totalPrice);
    }
}

// Main Class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating objects for VegItem and NonVegItem
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Tikka", 300, 1);

        // Creating order processing object
        OrderProcessing orderProcessing = new OrderProcessing();

        // Processing orders
        System.out.println("\nProcessing Veg Item Order:");
        orderProcessing.processOrder(vegItem);
        
        System.out.println("\nProcessing Non-Veg Item Order:");
        orderProcessing.processOrder(nonVegItem);
    }
}

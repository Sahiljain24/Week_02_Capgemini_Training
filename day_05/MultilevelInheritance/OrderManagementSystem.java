package day_05.MultilevelInheritance;

/*Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes. */

// Base class: Order
class Order {
    // Common attributes of an Order
    String orderId;
    String orderDate;

    // Constructor to initialize the Order object
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display basic order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Method to get the order status (Base class assumes "Order Placed" status)
    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass: ShippedOrder (inherits from Order)
class ShippedOrder extends Order {
    // Additional attribute for shipped orders
    String trackingNumber;

    // Constructor to initialize the ShippedOrder object
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        // Call the superclass constructor to initialize common attributes
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Method to display shipped order details, including tracking number
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call the superclass method to display basic order details
        System.out.println("Tracking Number: " + trackingNumber);
    }

    // Override getOrderStatus to return the status of a shipped order
    @Override
    public String getOrderStatus() {
        return "Shipped, Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (inherits from ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    // Additional attribute for delivered orders
    String deliveryDate;

    // Constructor to initialize the DeliveredOrder object
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Call the superclass constructor to initialize common and shipped order attributes
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Method to display delivered order details, including delivery date
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call the superclass method to display shipped order details
        System.out.println("Delivery Date: " + deliveryDate);
    }

    // Override getOrderStatus to return the status of a delivered order
    @Override
    public String getOrderStatus() {
        return "Delivered on: " + deliveryDate;
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        // Creating a DeliveredOrder object with order details
        DeliveredOrder deliveredOrder = new DeliveredOrder("44", "2025-01-20", "78524", "2025-01-23");

        // Displaying the order details for the delivered order
        deliveredOrder.displayOrderDetails();

        // Displaying the order status for the delivered order
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}

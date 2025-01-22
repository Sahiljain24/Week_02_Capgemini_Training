package self_problems;

import java.util.ArrayList;
import java.util.List;

// Product class represents a product in the store
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayInfo() {
        System.out.println(name + " Rs." + price);
    }
}

// Order class represents an order made by a customer
class Order {
    int orderId;
    List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (Product p : products) {
            p.displayInfo();
        }
    }
}

// Customer class represents a customer in the e-commerce system
class Customer {
    String name;
    int customerId;
    List<Order> orders;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with Order ID: " + order.orderId);
    }

    void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + customerId);
        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}

public class ProductMain {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Headphones", 199.99);
        Product p3 = new Product("Smartphone", 699.99);

        // Create an order
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Create another order
        Order order2 = new Order(102);
        order2.addProduct(p3);

        // Create a customer
        Customer customer1 = new Customer("Alice", 1);

        // Customer places orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Display customer and order details
        customer1.displayCustomerDetails();
    }
}
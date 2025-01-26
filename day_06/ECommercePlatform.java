// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();
}

// Interface Taxable
interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18; // 18% tax
    private static final double DISCOUNT_RATE = 0.10; // 10% discount

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private static final double DISCOUNT_RATE = 0.15; // 15% discount

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}

// Groceries class
class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}

// Main class to demonstrate the e-commerce platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        Product[] products = {
            new Electronics(101, "Laptop", 50000),
            new Clothing(102, "Jacket", 3000),
            new Groceries(103, "Rice", 1000)
        };

        // Calculate and print the final price for each product
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(product.getName() + " Tax Details: " + ((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------------------------");
        }
    }
}
                 
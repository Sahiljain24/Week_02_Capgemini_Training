class Circle {
    // Private member variable for the radius of the circle
    private double radius;

    // Default constructor - initializes the radius with a default value
    public Circle() {
        this(12.90); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor - initializes the radius with a specified value
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to update the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to display the radius and area of the circle
    public void display() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area of the circle: " + area(radius));
    }

    // Main method to create Circle objects and display their properties
    public static void main(String[] args) {
        // Create Circle objects using default and parameterized constructors
        Circle c1 = new Circle();
        Circle c2 = new Circle(33.4);

        // Display the properties of each Circle object
        c1.display();
        c2.display();
    }
}

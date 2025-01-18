class Book {
    // Private member variables for book details
    private String title;
    private String author;
    private int price;

    // Default constructor to initialize default values
    Book() {
        title = "Ikagai01";
        author = "Sadguru";
        price = 140;
    }

    // Parameterized constructor to initialize with custom values
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // Method to display book details is defined below
    }

    // Private method to display book details
    private void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book Price: " + price);
    }

    // Main method to create book objects and display their details
    public static void main(String[] args) {
        // Create two book objects
        Book e1, e2;

        // Initialize with parameterized and default constructors
        e1 = new Book("Ikigai", "Sadguru", 200);
        e2 = new Book();

        // Display book details
        e1.display();
        e2.display();
    }
}

public class LibraryManagement {
    // Book class representing a general book
    public static class Book {
        // Public field: accessible directly from anywhere
        public String ISBN;

        // Protected field: accessible within package and subclasses
        protected String title;

        // Private field: accessible only within the Book class
        private String author;

        // Constructor to initialize book details
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN; // Assign ISBN to the public field
            this.title = title; // Assign title to the protected field
            this.author = author; // Assign author to the private field
        }

        // Public method to set the author name
        public void setAuthor(String author) {
            this.author = author;
        }

        // Public method to get the author name
        public String getAuthor() {
            return this.author;
        }
    }

    // Subclass EBook that extends Book
    public static class EBook extends Book {
        // Constructor for EBook, calls the superclass constructor
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        // Method to display book details
        public void displayBookDetails() {
            // Accessing public field from superclass
            System.out.println("ISBN: " + ISBN);

            // Accessing protected field from superclass
            System.out.println("Title: " + title);

            // Accessing private field using getter method
            System.out.println("Author: " + getAuthor());
        }
    }

    // Main method to demonstrate the LibraryManagement system
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook("123-4567891234", "Learn Java", "John Doe");

        // Display book details using the method in the EBook class
        System.out.println("EBook Details:");
        ebook.displayBookDetails();

        // Directly accessing the public field (ISBN)
        System.out.println("\nDirect access to ISBN: " + ebook.ISBN);

        // Updating and retrieving the private author field using methods
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.


 */
// Class to represent a Book
public class Book {
    
    // Private attributes to store book details
    private String title;  // Title of the book
    private String author; // Author of the book
    private double price;  // Price of the book

    // Constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;   // Assign title
        this.author = author; // Assign author
        this.price = price;   // Assign price
    }

    // Method to display the details of the book
    public void displayBookDetails() {
        // Print book details using formatted output
        System.out.printf(
            "The Book \"%s\" is written by author \"%s\" and the price of the book is %.2f\n", 
            title, author, price
        );
    }
}

// Main class to test the Book class
class BookMain {
    public static void main(String[] args) {
        // Create a Book object with specific details
        Book book = new Book("The life of Sahil Jain", "Sahil Jain", 500);

        // Display the details of the book
        book.displayBookDetails();
    }
}

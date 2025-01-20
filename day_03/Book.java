/*Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
 */
// Class representing a Book
public class Book {
    // Static final variable to store the library name
    static final String libraryName = "Sumshine Library";

    // Static method to display the library name
    static final void displayLibraryName() {
        System.out.println("Library Name = " + libraryName);
    }

    // Instance variables to store book details
    private String title; // Title of the book
    private String author; // Author of the book
    private final int isbn; // Unique identifier (ISBN) for the book

    // Constructor to initialize book details
    Book(String title, String author, int isbn) {
        this.title = title; // Assign the title
        this.author = author; // Assign the author
        this.isbn = isbn; // Assign the ISBN
    }

    // Method to display the details of the book
    public void displayDetails() {
        // Call static method to display the library name
        displayLibraryName();
        // Display book details
        System.out.println("Book name = " + title +
                            ", Author = " + author +
                            ", isbn = " + isbn);
    }
}

// Main class to demonstrate the Book class
class BookMain {
    public static void main(String[] args) {
        // Create a new Book object with specified details
        Book first = new Book("Panchtantra", "Premchand", 457896);

        // Check if the object 'first' is an instance of the Book class
        if (first instanceof Book) {
            // Call the method to display the book details
            first.displayDetails();
        }
    }
}

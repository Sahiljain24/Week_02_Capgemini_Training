package day_05.singleInheritance;
/*Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
 */

// Superclass: Book
public class Book {
    // Attributes of the Book class
    String title;
    int publicationYear;

    // Constructor to initialize the Book object
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display information about the book
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (inherits from Book)
class Author extends Book {
    // Additional attributes specific to Author
    String name;
    String bio;

    // Constructor to initialize the Author object
    public Author(String title, int publicationYear, String name, String bio) {
        // Call the superclass constructor to initialize the Book attributes
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display information about the author and the book
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

  class LibraryManagement {
    public static void main(String[] args) {
        // Creating an Author object with Book details
        Author author = new Author("panchtantra", 1983, "vishnu sharma", " well known hindi writer.");
        
        // Displaying book and author details
        author.displayInfo();
    }
}

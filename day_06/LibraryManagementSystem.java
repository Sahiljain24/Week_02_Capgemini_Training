// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration(); // Duration in days
}

// Interface Reservable
interface Reservable {
    void reserveItem(String borrower);

    boolean checkAvailability();
}

// Subclass Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books have a loan duration of 14 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Book reserved for " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines have a loan duration of 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Magazine reserved for " + borrower);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs have a loan duration of 5 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("DVD reserved for " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class to demonstrate the library management system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Polymorphism: General reference for all items
        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Reserving items if they implement Reservable
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Is Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Is Available: " + reservable.checkAvailability());
            }
            // System.out.println("----------------------------------");
        }
    }
}

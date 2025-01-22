package assisted_problems;

import java.util.ArrayList;

// class Book with title and author
class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// class Library with list of books
class Library {
    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void display() {
        if (books.size() == 0) {
            System.out.println("No books in the library");
        } else {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor());
            }
        }

    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        library.addBook(book1);
        library.addBook(book2);
        library.display();

    }
}

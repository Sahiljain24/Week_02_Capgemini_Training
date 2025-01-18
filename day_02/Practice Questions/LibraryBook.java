class LibraryBook{
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;
    LibraryBook(){
        title="Ikagai01";
        author="Sadguru";
        price=140;
        isAvailable=true;
    }
    LibraryBook(String title, String author, int price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }

    // create a method to display the book details
    public void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book Price: "+price);
        if(isAvailable) {
            isAvailable = false;
            System.out.println(title + " book is available so you can borrow this book: ");
        }
        else {
            System.out.println("your book is not available here: ");
        }
    }
    public static void main(String[] args) {
        LibraryBook e1,e2,e3;
        e1=new LibraryBook("Ikigai","Sadguru",200,true);
        e2=new LibraryBook();
        e3=new LibraryBook("Summer story", "Summer",200,true);
        e1.display();
        e2.display();
        e2.display();
        e3.display();
        e3.display();
    }
}
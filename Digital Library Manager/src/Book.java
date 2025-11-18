// Step 1: Create the Book Class (The Blueprint for each book)
public class Book {

    // Properties (Data) - These should be private (Encapsulation)
    private String title;
    private String author;
    private int bookId;
    private boolean isAvailable;

    // Constructor - Used to create a new Book object
    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isAvailable = true; // New books are always available by default
    }

    // --- Getter Methods (To safely read private data) ---
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // --- Setter Method (To change the availability status) ---
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // --- Display Method ---
    public void displayDetails() {
        System.out.println("----------------------------------");
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        String status = this.isAvailable ? "YES" : "NO";
        System.out.println("Available: " + status);
        System.out.println("----------------------------------");
    }
}
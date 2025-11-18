import java.util.ArrayList; // Don't forget to import ArrayList

// Step 2: Create the LibraryManager Class
public class LibraryManager {

    // Data Structure: An ArrayList to hold all the Book objects
    private ArrayList<Book> bookList;

    // Constructor for the LibraryManager
    public LibraryManager() {
        // Initialize the empty list when the manager is created
        this.bookList = new ArrayList<>();
        System.out.println("Library Manager System Initialized.");
    }

    // ===================================================
    // Method 1: Add a Book
    // ===================================================
    public void addBook(Book newBook) {
        bookList.add(newBook);
        System.out.println("\n✅ Book added successfully: " + newBook.getTitle());
    }

    // ===================================================
    // Method 2: View All Books
    // ===================================================
    public void viewAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("\n🚫 The library currently has no books.");
            return;
        }

        System.out.println("\n--- LIST OF ALL BOOKS (" + bookList.size() + " books) ---");
        // Loop through the list and call the displayDetails method for each book
        for (Book book : bookList) {
            book.displayDetails();
        }
        System.out.println("----------------------------------------");
    }

    // ===================================================
    // Method 3: Search for a Book by ID
    // ===================================================
    public Book searchBook(int id) {
        // Loop through the list
        for (Book book : bookList) {
            // Check if the current book's ID matches the searched ID
            if (book.getBookId() == id) {
                System.out.println("\n🔍 Book Found:");
                book.displayDetails();
                return book; // Return the found Book object
            }
        }
        System.out.println("\n❌ Error: Book with ID " + id + " not found.");
        return null; // Return null if no book is found
    }

    // ===================================================
    // Method 4: Check Out a Book
    // ===================================================
    public void checkOutBook(int id) {
        Book bookToFind = searchBook(id); // Use the search method to find the book

        if (bookToFind != null) {
            if (bookToFind.isAvailable()) {
                bookToFind.setAvailable(false); // Update the status using the setter method
                System.out.println("\n✅ CHECKOUT SUCCESSFUL: '" + bookToFind.getTitle() + "' is now checked out.");
            } else {
                System.out.println("\n⚠️ WARNING: '" + bookToFind.getTitle() + "' is already checked out.");
            }
        }
        // If bookToFind is null, the error message is already printed by searchBook(id)
    }

    // You can add more methods here, like removeBook(int id)
}
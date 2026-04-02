import java.util.ArrayList;
import java.util.Scanner;

// ==================== INTERFACE ====================
// Borrowable interface demonstrates abstraction at the interface level
interface Borrowable {
    void borrowItem();

    void returnItem();

    boolean isBorrowed();
}

// ==================== ABSTRACT CLASS ====================
// Abstract class LibraryItem demonstrates abstraction and encapsulation
abstract class LibraryItem {
    // Encapsulated fields (private with public getters/setters)
    private String title;
    private String itemId;

    // Constructor
    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    // Abstract method - subclasses must implement this (demonstrates abstraction)
    public abstract void displayDetails();

    // Getters and Setters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    // toString() method overriding (demonstrates polymorphism)
    @Override
    public String toString() {
        return "ID: " + itemId + " | Title: " + title;
    }
}

// ==================== BOOK CLASS ====================
// Book extends LibraryItem (demonstrates inheritance)
// Book implements Borrowable (demonstrates interface implementation)
class Book extends LibraryItem implements Borrowable {
    // Additional encapsulated fields specific to Book
    private String author;
    private int publicationYear;
    private boolean borrowed;

    // Constructor
    public Book(String title, String itemId, String author, int publicationYear) {
        super(title, itemId); // Calling parent class constructor
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    // Implementing abstract method from LibraryItem
    @Override
    public void displayDetails() {
        System.out.println("--- BOOK DETAILS ---");
        System.out.println("ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Status: " + (borrowed ? "Borrowed" : "Available"));
        System.out.println("--------------------");
    }

    // Implementing Borrowable interface methods
    @Override
    public void borrowItem() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book '" + getTitle() + "' has been borrowed.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("Book '" + getTitle() + "' was not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    // Getters and Setters for Book-specific fields
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Method overloading (demonstrates polymorphism - compile-time)
    public void updateBook(String newTitle) {
        setTitle(newTitle);
    }

    public void updateBook(String newTitle, String newAuthor) {
        setTitle(newTitle);
        this.author = newAuthor;
    }

    public void updateBook(String newTitle, String newAuthor, int newYear) {
        setTitle(newTitle);
        this.author = newAuthor;
        this.publicationYear = newYear;
    }
}

// ==================== MAGAZINE CLASS ====================
// Magazine extends LibraryItem (demonstrates inheritance)
class Magazine extends LibraryItem implements Borrowable {
    // Additional encapsulated fields specific to Magazine
    private String publisher;
    private String issueDate;
    private boolean borrowed;

    // Constructor
    public Magazine(String title, String itemId, String publisher, String issueDate) {
        super(title, itemId);
        this.publisher = publisher;
        this.issueDate = issueDate;
        this.borrowed = false;
    }

    // Implementing abstract method from LibraryItem
    @Override
    public void displayDetails() {
        System.out.println("--- MAGAZINE DETAILS ---");
        System.out.println("ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Status: " + (borrowed ? "Borrowed" : "Available"));
        System.out.println("------------------------");
    }

    // Implementing Borrowable interface methods
    @Override
    public void borrowItem() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Magazine '" + getTitle() + "' has been borrowed.");
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Magazine '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("Magazine '" + getTitle() + "' was not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    // Getters and Setters for Magazine-specific fields
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}

// ==================== LIBRARY MANAGER CLASS ====================
// LibraryManager handles the collection of library items
class LibraryManager {
    // ArrayList to store library items (Polymorphism - storing different types in
    // one list)
    private ArrayList<LibraryItem> items;
    private int itemCount;

    public LibraryManager() {
        items = new ArrayList<>();
        itemCount = 0;
    }

    // Method to add a book
    public void addBook(String title, String author, int publicationYear) {
        String itemId = "B" + (1000 + itemCount);
        Book book = new Book(title, itemId, author, publicationYear);
        items.add(book);
        itemCount++;
        System.out.println("Book added successfully with ID: " + itemId);
    }

    // Method to add a magazine
    public void addMagazine(String title, String publisher, String issueDate) {
        String itemId = "M" + (2000 + itemCount);
        Magazine magazine = new Magazine(title, itemId, publisher, issueDate);
        items.add(magazine);
        itemCount++;
        System.out.println("Magazine added successfully with ID: " + itemId);
    }

    // Method to display all items (demonstrates polymorphism)
    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("\n========== ALL LIBRARY ITEMS ==========");
        // Polymorphism: calling displayDetails() on different types
        for (LibraryItem item : items) {
            item.displayDetails();
        }
        System.out.println("========================================");
    }

    // Method to find an item by ID
    public LibraryItem findItemById(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }

    // Method to borrow an item
    public void borrowItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item != null && item instanceof Borrowable) {
            ((Borrowable) item).borrowItem();
        } else {
            System.out.println("Item not found with ID: " + itemId);
        }
    }

    // Method to return an item
    public void returnItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item != null && item instanceof Borrowable) {
            ((Borrowable) item).returnItem();
        } else {
            System.out.println("Item not found with ID: " + itemId);
        }
    }

    // Method to get total count of items
    public int getItemCount() {
        return items.size();
    }
}

// ==================== MAIN CLASS ====================
public class ConsoleApp {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("========================================");
        System.out.println("   WELCOME TO THE LIBRARY MANAGEMENT SYSTEM");
        System.out.println("   Demonstrating OOP Concepts in Java");
        System.out.println("========================================");

        do {
            // Display menu
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Magazine");
            System.out.println("3. Display All Items");
            System.out.println("4. Borrow an Item");
            System.out.println("5. Return an Item");
            System.out.println("6. Display Total Items");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            // Input validation
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Please enter a number (1-7): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a Book
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addBook(bookTitle, author, year);
                    break;

                case 2:
                    // Add a Magazine
                    System.out.print("Enter magazine title: ");
                    String magTitle = scanner.nextLine();
                    System.out.print("Enter publisher name: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter issue date (e.g., Jan-2024): ");
                    String issueDate = scanner.nextLine();
                    library.addMagazine(magTitle, publisher, issueDate);
                    break;

                case 3:
                    // Display all items
                    library.displayAllItems();
                    break;

                case 4:
                    // Borrow an item
                    System.out.print("Enter item ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    library.borrowItem(borrowId);
                    break;

                case 5:
                    // Return an item
                    System.out.print("Enter item ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnItem(returnId);
                    break;

                case 6:
                    // Display total items
                    System.out.println("Total items in library: " + library.getItemCount());
                    break;

                case 7:
                    System.out.println("Thank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option (1-7).");
            }

        } while (choice != 7);

        scanner.close();
    }
}
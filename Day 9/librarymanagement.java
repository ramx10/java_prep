package Day 9;

class Book {

    private static int count = 1000;

    private int id;
    private String name;
    private String authorName;
    private String category;
    private double price;
    private int availableCopies;

    // Constructor
    Book(String name, String authorName, String category,
         double price, int availableCopies) {

        id = ++count;

        // Default name
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown Book";
        } else {
            this.name = name;
        }

        // Remove extra spaces
        this.authorName = authorName.trim();
        this.category = category;

        // Price cannot be negative
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

        // Copies cannot be negative
        if (availableCopies < 0) {
            this.availableCopies = 0;
        } else {
            this.availableCopies = availableCopies;
        }
    }

    // Display details
    void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Book Name : " + name);
        System.out.println("Author Name : " + authorName);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Available Copies : " + availableCopies);
        System.out.println();
    }

    // Borrow book
    void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(name + " borrowed successfully.");
        } else {
            System.out.println(name + " is not available.");
        }
    }

    // Return book
    void returnBook() {
        availableCopies++;
        System.out.println(name + " returned successfully.");
    }

    // Check availability
    boolean isAvailable() {
        return availableCopies > 0;
    }

    // Update price
    void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        }
    }

    // Getters
    String getName() {
        return name;
    }

    String getAuthorName() {
        return authorName;
    }

    double getPrice() {
        return price;
    }

    int getAvailableCopies() {
        return availableCopies;
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Java Programming",
                " Pankaj ",
                "Programming",
                600,
                5);

        Book b2 = new Book(
                "Python Basics",
                "Rahul",
                "Programming",
                450,
                3);

        Book b3 = new Book(
                "Java Complete Reference",
                "Pankaj",
                "Programming",
                900,
                2);

        Book b4 = new Book(
                "",
                " Amit ",
                "Programming",
                300,
                4);

        Book books[] = {b1, b2, b3, b4};

        // Display all books
        System.out.println("----- All Books -----");
        for (Book b : books) {
            b.display();
        }

        // Borrow and return
        b1.borrowBook();
        b1.returnBook();

        // Availability
        if (b1.isAvailable()) {
            System.out.println(b1.getName() + " is available.");
        } else {
            System.out.println(b1.getName() + " is not available.");
        }

        // Update price
        b2.updatePrice(500);

        // 1. Costliest book
        Book costliest = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > costliest.getPrice()) {
                costliest = books[i];
            }
        }

        System.out.println("\nCostliest Book : "
                + costliest.getName());

        // 2. Cheapest book
        Book cheapest = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() < cheapest.getPrice()) {
                cheapest = books[i];
            }
        }

        System.out.println("Cheapest Book : "
                + cheapest.getName());

        // 3. Count books starting with "Java"
        int javaCount = 0;

        for (Book b : books) {
            if (b.getName().startsWith("Java")) {
                javaCount++;
            }
        }

        System.out.println("Books starting with Java : "
                + javaCount);

        // 4. Count books written by Pankaj
        int authorCount = 0;

        for (Book b : books) {
            if (b.getAuthorName().equalsIgnoreCase("Pankaj")) {
                authorCount++;
            }
        }

        System.out.println("Books written by Pankaj : "
                + authorCount);

        // 5. Total inventory value
        double totalInventory = 0;

        for (Book b : books) {
            totalInventory +=
                    b.getPrice() * b.getAvailableCopies();
        }

        System.out.println("Total Inventory Value : "
                + totalInventory);
    }
}
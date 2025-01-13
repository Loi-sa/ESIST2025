class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // toString() method for convenient output
    @Override
    public String toString() {
        return "Title: \"" + title + "\"" +
                "\nAuthor: " + author +
                "\nYear Published: " + yearPublished +
                "\nPrice: $" + price;
    }
}

public class Tasksheet123 {
    public static void main(String[] args) {
        // Create three Book objects using the constructor
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print the details of each book
        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);
        System.out.println("\nBook 3:\n" + book3);
    }
}
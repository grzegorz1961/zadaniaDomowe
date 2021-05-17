package coderslab.dzien2.konstruktor;

public class Book {

    private String name;
    private double price;
    private String author;
    public Author mainAuthor;
    public Author[] additionalAuthors;

    public Book() {
        System.out.println("Tworzenie obiektu klasy Book.");
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Thinking in Java", 95.99, "Bruce Eckel");
        System.out.println(book1.author + ", " + book1.name+ ", " + book1.price);
    }
}

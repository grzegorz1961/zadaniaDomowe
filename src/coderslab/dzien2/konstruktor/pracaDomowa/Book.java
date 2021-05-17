package coderslab.dzien2.konstruktor.pracaDomowa;

import coderslab.dzien2.konstruktor.Author;

import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private boolean  available;
    private Author author;
    private Author [] additionalAuthors = new Author[0];

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, Author author) {
        this.id = id;
        this.author = author;
    }

    public Book(int id, String title, boolean available, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.available = available;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                ", author=" + author +
                ", additionalAuthors=" + Arrays.toString( additionalAuthors ) +
                '}';
    }
}

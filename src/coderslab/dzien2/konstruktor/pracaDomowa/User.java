package coderslab.dzien2.konstruktor.pracaDomowa;

import coderslab.dzien2.konstruktor.Author;
/* Zadanie 4
Stwórz klasę User, która ma spełniać następujące wymogi:

Mieć prywatne atrybuty:
id - atrybut ten powinien trzymać numer identyfikacyjny,
firstName - atrybut określający imię autora,
lastName - atrybut określający nazwisko autora,
books - tablica obiektów klasy Book.
Posiadać konstruktor przyjmujący id, imię, nazwisko.
Dodaj metodę addBook(Book book), która doda nową książkę do tablicy książek danego użytkownika.
Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy. */

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book [] books = new Book [0];

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private void addBook(Book book){
        // najpierw dodajemy w tablicy krotkę żeby wpisać do niej operację
        // robimy kopie tablicy o rozmiarze o jeden większym niż aktualna
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        // w ostatnią komórkę tablicy wstawiamy operację
        this.books[this.books.length-1] = book;
    }

    public Book [] updateArray(Book[] src, int id) {

        Book[] updateBook = new Book [id];
        if (id > src.length) {
            System.arraycopy(src, 0, updateBook, 0, src.length);
        } else {
            System.arraycopy(src, 0, updateBook, 0, id);
        }
        return updateBook;
    }
    // Tworzymy metode pokaż książki w liście tablic allBooks
    public void showBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
      //Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.
     // utwórz listę tablic
        ArrayList alBooks = new ArrayList();
        System.out.println("Initial size of alBooks: " + alBooks.size());

    // dodaj elementy do listy tablic
        alBooks.add("Krzyzacy");
        alBooks.add("Lalka");
        alBooks.add("Ogniem i miczem");
        alBooks.add("Popioły");
        alBooks.add("Kurs Java");
        alBooks.add("Kurs SQL");
        alBooks.add(1, "Potop");
        System.out.println("Size of alBooks after additions: " + alBooks.size());

        // wyświetlić listę tablic
        System.out.println("Contents of alBooks: " + alBooks);

        // Usuń elementy z listy tablic
        alBooks.remove("F");
        alBooks.remove(2);
        System.out.println("Size of alBooks after deletions: " + alBooks.size());
        System.out.println("Contents of alBooks: " + alBooks);

        User user1 = new User(1,"Jan", "Kowalski");
        User user2 = new User(2,"Kasia", "Nowakowska");
        System.out.println("Id: " + user1.id + ", First Name: " + user1.firstName+ ", Last Name: " + user1.lastName);
        System.out.println();
        System.out.println("Id: " + user2.id + ", First Name: " + user2.firstName+ ", Last Name: " + user2.lastName);
        user1.addBook(new Book(1,"Krzyżacy"));
        user2.addBook( new Book(2,"Ogniem i mieczem") );
        user1.showBooks();
        user2.showBooks();
    }
}

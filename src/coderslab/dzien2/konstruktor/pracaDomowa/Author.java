package coderslab.dzien2.konstruktor.pracaDomowa;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public Author(int id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }
}

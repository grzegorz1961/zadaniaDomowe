package coderslab.dzien2.konstruktor;

public class Person {
    private String name="Jan";
    private String surname="Kowalski";
    private int age=33;
    private char gender='m';

    public Person() {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        System.out.println("Imie: " + name + ","+ " Nazwisko: " + surname + "," + " wiek: " + age+ ","+ " Plec: " + gender);
    }
}

package coderslab.dzien1.metody;

public class Main01 {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person.getFullName());
        person.increaseAge();
        person.getSurname();
        person.getName();
        person.getGender();
        person.setName("Jan");
        person.setGender( 'k' );


    }
}

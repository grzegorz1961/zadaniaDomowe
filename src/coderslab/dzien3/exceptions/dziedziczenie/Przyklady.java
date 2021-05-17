package coderslab.dzien3.exceptions.dziedziczenie;

public class Przyklady {

    public void printMessage(String message) {
//        if (message == null) {
//            throw new IllegalArgumentException();
//        } else {
//            System.out.println(message);
//        }
        try {
            printMessage(null);
            System.out.println("Message successfully printed");
        } catch (IllegalArgumentException e) {
            System.out.println("Message is null!");
        }
    }

}

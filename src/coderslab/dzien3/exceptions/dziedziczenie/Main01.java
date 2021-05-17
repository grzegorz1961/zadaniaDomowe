package coderslab.dzien3.exceptions.dziedziczenie;
/*W pliku Main01.java została umieszczona metoda o sygnaturze: public static int factorial(int number)
zwracająca silnię liczby naturalnej przekazanej w parametrze.
1.zmodyfikuj kod tak, aby metoda zwracała wyjątek IllegalArgumentException w sytuacji, gdy liczba number przekazana
 w parametrze będzie mniejsza od zera,
2.zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego,
3.przetestuj działanie programu wywołując metodę factorial z poprawnym i z niepoprawnym parametrem,
4. przy wywołaniu metody factorial dodaj obsługę wyjątku IllegalArgumentException,
5. przetestuj ponownie działanie programu.
 */
public class Main01 {

    public static void main(String[] args) {
            System.out.println(factorial(3));
            System.out.println(factorial(-2));

    }

    static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
//public class Main01 {
//
//    static int factorial(int number) {
//        int result = 1;
//        if (number >= 0) {
//            try {
//                for (int i = 1; i <= number; i++) {
//                    result *= i;
//                }
//                return result;
//            }else {
//            catch (IllegalArgumentException e) {
//                System.out.println("Silnia moze byc liczona tylko dla number >= 0");
//            }
//        }
//        return result;
//    }
//
//        public static void main (String[]args){
//            System.out.println(factorial(3));
//            System.out.println(factorial(-2));
//   }
//
//}

package coderslab.dzien2.konstruktor.pracaDomowa;
/* Zadanie 1
Stwórz klasę BankAccount, która ma spełniać następujące wymogi:

Mieć prywatne atrybuty:
number - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć że numerem konta może być dowolna liczba całkowita),
cash - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa. Atrybut cash powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
Posiadać konstruktor przyjmujący tylko numer konta.
Posiadać gettery do atrybutów number i cash, ale NIE posiadać do nich setterów (nie chcemy żeby raz stworzone konto mogło zmienić swój numer, a do atrybutu cash dodamy specjalne funkcje modyfikujące jego wartość).
Posiadać metodę void depositCash(amount) której rolą będzie zwiększenie wartości atrybutu cash o podaną wartość. Pamiętaj o sprawdzeniu czy podana wartość jest:
Większa od 0
Posiadać metodę double withdrawCash(amount) której rolą będzie zmniejszenie wartości atrybutu cash o podaną wartość. Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy że ilość pieniędzy na koncie nie może zejść poniżej 0, np. jeżeli z konta na którym jest 300zł próbujemy wypłacić 500zł to metoda zwróci nam tylko 300zł. Pamiętaj o sprawdzeniu czy podana wartość jest:
Większa od 0
Posiadać metodę String printInfo() nie przyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie. */

public class BankAccount {
    private int number;
    private double cash = 0;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public double getCash() {
        return this.cash;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.cash += amount;
            System.out.println("Deposit Cash total: " + this.cash);
        } else {
            System.out.println("No funds on deposit");
        }
    }

    public double withdrawCash(double amount) {
        if (amount > 0 && amount < cash) {
            this.cash -= amount;
            return amount;
        } else if (amount > cash){
            amount =this.cash;
            this.cash = 0;
            return amount;
        }
        return 0;
    }

    public String printInfo() {
        return "Nr konta: " + this.number + ", Stan konta: " + this.cash;
    }

    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount(1);
        BankAccount secondAccount = new BankAccount(2);
        BankAccount thirdAccount = new BankAccount(3);

        firstAccount.depositCash( 0.00);
        System.out.println("Amount of money withdrawn: " + firstAccount.withdrawCash(-100.00));
        System.out.println();
        secondAccount.depositCash(100.00);
        System.out.println("Amount of money withdrawn: " + secondAccount.withdrawCash(50.00));
        System.out.println();
        thirdAccount.depositCash(100.00);
        System.out.println("Amount of money withdrawn: " + thirdAccount.withdrawCash(10.00));
        System.out.println();
        System.out.println(firstAccount.printInfo());
        System.out.println(secondAccount.printInfo());
        System.out.println(thirdAccount.printInfo());
    }
}


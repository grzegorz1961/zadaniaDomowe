package coderslab.dzien2.konstruktor;

import java.util.Arrays;

/*	Zadanie 2.

	Stwórz klasę `Calculator`. Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String ,
	w której będzie trzymać historię ostatnich operacji (stwórz ją w konstruktorze - z początkowym rozmiarem 0). Następnie dodaj do klasy następujące metody:

	`add(num1, num2)- metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "addednum1tonum2gotresult`".
	`multiply(num1, num2)- metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multipliednum1withnum2gotresult`".
	`subtract(num1, num2)- metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtractednum1fromnum2gotresult`".
	`divide(num1, num2)- metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "dividednum1bynum2gotresult`".
	Pamiętaj, że nie można dzielić przez zero.
	`printOperations()` - metoda ma wypisać wszystkie zapamiętane operacje.
	`clearOperations()` - metoda ma wyczyścić wszystkie zapamiętane operacje.
	Możesz dopisać metodę pomocniczą która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.

	Pamiętaj o używaniu `this` w odpowiednich miejscach. Stwórz kilka kalkulatorów i przetestuj ich działanie.
*/
public class Calculator {

    // Tworzenie zmiennych i inicjalizacja zmiennych num1 i num2
    private double num1 = 0.00;
    private double num2 = 0.00;
    // Tworzenie tablicy Stringw, w której będzie trzymać historię ostatnich operacji
    private String[] operations;

    public Calculator() {
        this.operations = new String[0];
    }

    // Tworzenie metody która ma dodać do siebie dwie zmienne i zwrócić wynik.
    public double add(double num1, double num2){
        addToOperations("added: "+num1+" to "+num2+ " got result: "+(num1+num2));
        return num1+num2;
    }

    // Tworzenie metody która ma pomnożyć przez siebie dwie zmienne i zwrócić wynik.
    public double multiply(double num1, double num2){
        addToOperations("multiplied: "+num1+" with "+num2+ " got result: "+(num1*num2));
        return num1*num2;
    }

    // Tworzenie metody która ma odjąć od siebie dwie zmienne i zwrócić wynik.
    public double subtract(double num1, double num2){
        addToOperations("subtracted: "+num1+" from "+num2+ " got result: "+(num1-num2));
        return num1-num2;
    }

    // Tworzenie metody która ma podzielić przez siebie dwie zmienne i zwrócić wynik.
    public double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Błąd - próba dzielenia przez zero");
            addToOperations("Error - dividing by zero");
            return 0;
        }
        addToOperations("divided: "+num1+" by "+num2+ " got result: "+(num1/num2));
        return num1/num2;
    }

    //Metoda ma wypisać wszystkie zapamiętane operacje.
    public void printOperations(){
        for (String s : this.operations) {
            System.out.println(s);
        }
    }

    // Metoda ma wyczyścić wszystkie zapamiętane operacje.
    public void clearOperations(){
        this.operations = Arrays.copyOf(this.operations, 0);
    }

    //Metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowani
    public void addToOperations(String operation){
        this.operations = Arrays.copyOf(this.operations, this.operations.length+1);
        this.operations[this.operations.length-1] = operation;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiply(5.5, 4.9);
        calculator.divide(5.6, 1.00);
        calculator.add(5.09, 0.99);
        calculator.subtract(30.88, 6.01);
        System.out.println();
        calculator.printOperations();
        calculator.clearOperations();
    }
}

package coderslab.dzien3.exceptions.dziedziczenie.prcaDomowa_2;
/*
Stwórz klasę Shape, która będzie posiadała:

prywatne atrybuty x i y (określające środek tego kształtu) oraz color,
konstruktor, przyjmujący zmienne określające wartości x, y i color,
metodę o nazwie getDescription(), wypisującą informacje o tym kształcie, zwracającą wartość typu String,
metodę o nazwie getDistance(Shape shape), zwracającą odległość od środka innego kształtu, wynik ma być typu double.
Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.
 */
public class Shape {
    private double x;
    private double y;
    private String color;
    private double z = 5.88;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;

    }
    private String getDescription(){
        return "cirlce";
    }
    private double getDistance(Shape shape){
        return z;
    }

    public static void main(String[] args) {
      Shape shape = new Shape(3.5,4.8,"greenn");
      System.out.println(shape.getDistance(shape));
      System.out.println(shape.getDescription());
    }
}

package coderslab.dzien1.metody;
//Stwórz klasę Car, posiadającą następujące atrybuty:
//
//        brand
//        model
//        price
//        Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.
//
//        Dopisz metodę toString, wyświetlającą markę oraz cenę w jednej linii.
public class Car {
    private String brand = "Renault";
    private String model= "Thalia";
    private double price = 36000.50;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString (){

        return "Marka: " + brand + " " + "Cena: " + price;
    }
}

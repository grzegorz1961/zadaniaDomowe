package coderslab.dzien1.metody;

public class Main02 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Marka :" + car.getBrand());
        System.out.println("Model :" + car.getModel());
        System.out.println("Cena :" + car.getPrice());
        System.out.println(car.toString());
    }
}

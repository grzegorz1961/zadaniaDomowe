package coderslab.dzien1.atrybuty;

import coderslab.dzien1.atrybuty.Cat;
import coderslab.dzien1.atrybuty.Dog;

public class Main01 {
    public static void main(String[] args) {
        Cat filemon = new Cat();
        Dog dog = new Dog();

        // W przypadku dwa razy tworzymy obiekt w pamięci
        if(filemon.equals(dog)) {
            System.out.println("Są równe");
        } else {
            System.out.println("Nie sa równe");
        }
    }
}

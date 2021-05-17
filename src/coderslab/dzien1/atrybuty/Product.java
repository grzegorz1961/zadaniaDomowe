package coderslab.dzien1.atrybuty;

public class Product {

   private String name = "Product_first";

//    Dodaj metody setName (ustawiającą name) oraz getName (zwracającą name

    public void setName(String name){
        this.name = name;
        System.out.println(name);
    }

    public String getname() {
        //tutaj znajdzie się ciało metody
        return this.name;
    }

}

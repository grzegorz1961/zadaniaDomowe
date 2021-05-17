package coderslab.dzien1.metody;

public class Person {
    private String name = "Michał";
    private String surname = "Nowakowski";
    private static int age = 30;
    private char gender ='m';

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void increaseAge(){
        this.age+=1;
       System.out.println(Person.age);
    }
       public String getFullName(){
        return this.name + " "+ this.surname;
    }
}


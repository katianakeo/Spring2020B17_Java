package day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;


    public void setDogInfo(String Breed, String Size, int Age, String Color, String name){
        this.breed = Breed;
        this.size = Size;
        this.age = Age;
        this.color = Color;
        this.name = name;


    }
    public String toString(){
        return "Dog Name: "+name+", breed: "+breed+", size: "+size+", color is: "+color+", age: "+age;
    }



}

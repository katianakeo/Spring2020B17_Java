package day33_CustomClass;

public class cat {
    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void eat(String catfood){
        System.out.println(name+" is eating "+catfood);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void setCatInfo(String catbreed, String catcolor, int catage, String catname){
        breed = catbreed;
        color = catcolor;
        age = catage;
        name = catname;
    }

    public String toString(){
        return name + ", breed is " + breed+", color is "+color+", "+age+" years old";
    }


}

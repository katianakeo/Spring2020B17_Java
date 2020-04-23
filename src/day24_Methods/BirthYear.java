package day24_Methods;

public class BirthYear {
    public static void Age(int birthYear){
        int currentyear = 2020;
        int age = currentyear-birthYear;
        if(birthYear<currentyear){
            System.out.println(age);
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println(age);
    }

    public static void main(String[] args) {
        int a = 2002;
        Age(a);
    }
    public static void printHello(){
        System.out.println("Hello");
    }
}

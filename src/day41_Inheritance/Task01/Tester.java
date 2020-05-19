package day41_Inheritance.Task01;

public class Tester extends Employee {

    public Tester(String name, double salary, int ID, String jobTitle, char gender){
        this.name = name;
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void reporting(){
        System.out.println(name+" is reporting");

    }

    public void testing(){
        System.out.println(name+" is testing");
    }
}

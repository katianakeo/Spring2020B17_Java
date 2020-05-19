package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, double salary, int ID, char gender){
        this.name = name;
        this.salary = salary;
        this.ID = ID;
        jobTitle = "Business Analyst";
        this.gender = gender;
    }
    public void writingReq(){
        System.out.println(name+" is writing requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }
}

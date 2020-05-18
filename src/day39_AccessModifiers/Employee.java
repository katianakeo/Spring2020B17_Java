package day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    long ID;
    double salary;
    char gender;
    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, String jobTitle){
      this(name);
      //  this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee(String name, String jobTitle, long ID){
        this(name, jobTitle);
        this.ID = ID;
    }


    public String toString(){
        return "Name: "+name+" id: "+ID+" jobTitle: "+jobTitle+" salary: "+salary+" gender: "+gender;
    }
}

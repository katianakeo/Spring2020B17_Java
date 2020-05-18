package day39_AccessModifiers;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Rustem");
        System.out.println(employee1);

        Employee employee2 = new Employee("John", "Mechanic");
        System.out.println(employee2);



    }
}

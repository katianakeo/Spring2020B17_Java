package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer dev1 = new Developer(120000, "Namik", 123, "Software Developer", 'M');
        dev1.fixingBug();
        System.out.println(dev1);

        Tester tester1 = new Tester("Lina", 100000, 124, "SDET", 'F');
        tester1.testing();
        System.out.println(tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur", 110000, 125, 'M');
        BA1.writingReq();
        BA1.gathering();
        System.out.println(BA1);
    }
}

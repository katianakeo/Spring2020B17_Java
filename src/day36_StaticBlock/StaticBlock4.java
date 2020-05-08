package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1 = new Tester();

    int insVariable;

    static{
        // gets executed first
        // designed to initialize static variables
        name = "Cybertek School";
        tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);

        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable = 300;
    }

    public static void main(String[] args) {
        System.out.println(name);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);
    }
}

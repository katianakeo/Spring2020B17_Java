package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("Jean", 123, "SDET", 120000);
        System.out.println(tester1);
    }



    static{
        a=100;
        b=200;
        if(100>200){
            a=100;
        }
        else{
            b=200;
        }
    }
}

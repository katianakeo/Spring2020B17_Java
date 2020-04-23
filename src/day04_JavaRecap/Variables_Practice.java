package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {
        // DataType variableName = Data;
        // whole numbers : byte, int, short, long
        // byte range : -127 - 127

        // largest to smallest: double, float, long, int, short, byte
        byte num1 = 100;
        // short s1 = num1;
        // can assign smaller dataType to bigger dataType
        long l1 = 9999999999l;
        float f1 = 100l;
        System.out.println(f1);
        float f2 = 100.5f;
        System.out.println(f2);
        double d1 = 15.5;
        double d2 = 10; //10.0
        double d3 = 100L; // 100.0

        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = 45000;
        System.out.println(ch2);

        int a1 = 'a';
        System.out.println(a1);

        int a2 = 'a'+'b';
        // 97+98
        System.out.println(a2);

        double dnum = 'a';
        System.out.println(dnum);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(10>5+5);
        System.out.println(10!=10);
        System.out.println(10 >=10);
        System.out.println(10 == 10);

        System.out.println('a' != 97);
        System.out.println(!true);
        // false
        System.out.println(!false);
        // true

        boolean r2 = !(9>10) != !(10>9);
        System.out.println(r2);
        boolean r3 = !!!true;
        System.out.println(r3);









    }



}

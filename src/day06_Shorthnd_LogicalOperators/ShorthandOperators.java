package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10; // X = x + 10 ==> x = 20 + 10 ==> x = 30
        System.out.println(x);
        // the value of x is now 30, not 20 anymore after

        x += 60;
        // x = x + 60 ==> 30+60
        System.out.println(x);

        String schoolname = "Cybertek";
        schoolname += 12345; // schoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a'+'b');
                        // 97 + 98 ==> 195
        char ch1 = 'a';
        ch1 =+ 'b';
        System.out.println(ch1);
        // char gives you character

        int num = 'z'; //
        num += 'x'; // num = num + x
        System.out.println(num);

        System.out.println("=================================");
        int A = 100;
        A -= 90; // A = A - 90 ==> 100 - 90 ==> 10
        System.out.println(A);
        // A = 10

        int B = 200;
        B -= A; // B = B-A

        int a = 2;
        a *= 3;
        // a = a*3 ==> a = 2*3 ==> a = 6
        System.out.println(a);

        int b = a*= 10;
        // b = a = a*10 = 60

        int a1 = 100;
        int b1 = (a1*=2) + ++a1;
        // b1 = 100*2 + 201
        // b1 = 200 + 201
        System.out.println(b1);

        int x1 = 10;
        int y = x1+=10*2;
            // x1 += 20 ==> x = x + 20 ==> 30
        System.out.println(y);

        int q = 20;
        int p = q*=20 * 3;
        // p = q*= 60
        // p = q * 60
        // p = 20 * 60 ==> 1200
        System.out.println(p);

        int num1 = 300;
        num1 /= 2;
        // *remember num1 = 300*
        // num1 = num1/ 2 ==> num1 = 300/2
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 +10;
        // num2 = num2 / 20+10
        // 400 / 20 + 10
        // 400 / 30
        // 13.333 but its int so it's rounded to 13

        int num3 = 300;
        num3 %= 10 +20; // num3 %= 30
        // num3 = num3 % 30
        // num3 = 300 % 30
        // ==> 0

        int n1 = 400;
        n1 %= 3*5;
        // n1 = n1 % 3*5
        // n1 = 400 % 15
        // n1 =


    }



}

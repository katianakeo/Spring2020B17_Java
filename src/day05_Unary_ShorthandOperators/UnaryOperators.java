package day05_Unary_ShorthandOperators;

import javax.swing.*;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10; // positive 10
        int b = +a; // positive 10

        int a2 = -10;
        boolean result1 = a2>0;
        boolean result2 = a2<0;
        System.out.println(result1);
        System.out.println(result2);

        int x1 = -10;
        int y1 = -x1;
        // -(-10) = +10
        System.out.println(y1);

        int x2 = +20;
        int y2 = - x2;
        // -(+20) = -20

        int x3 = +20;
        int y3 = +x3;
        // +(+20) = +20

        int z = 100;
        System.out.println(++z);
        // 101
        System.out.println(z);
        // runs top to bottom so it'll be 101

        int P = 100;
        System.out.println(P++);
        System.out.println(P);






    }


}

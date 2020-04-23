package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        // pre: increases/decreases immediately

        int a = 100;
        System.out.println(++a);
        // 101

        int b = 100;
        System.out.println(--b);
        // 99

        // post: you have to print it in the print statement with the operators in order for the value to change

        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--);
        System.out.println(B);

        int s = 10;
        int f = s++;
        // you have to print it first in order for the value to change
        System.out.println(f);
        System.out.println(s);

        // decrement
        double t = 3.5;
        double t2 = t--;
        System.out.println(t2);
        System.out.println(t);

        int num = 35;
        System.out.println(num++);
        System.out.println(num--);






    }



}

package day26_MethodOverloading;

import java.util.Arrays;

public class methodOverloading2 {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        sum(10,5);
        sum(15, 10, 5);
        sum(10,20,30,5);
        
    }

}

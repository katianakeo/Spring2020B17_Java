package day29_Wrapper_ArrayList;

public class valueOfMethods {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str); // Integer
        System.out.println(a);

        double b = Integer.valueOf(str);
        System.out.println(b);


        String str2 = "23.4";
        double d1 = Double.parseDouble(str2);  // returns primitive
        System.out.println(d1);
        // double = double

        double d2 = Double.valueOf(str2);
        System.out.println(d2);
        // double = Double unboxing
        System.out.println(d1 == d2);


    }
}

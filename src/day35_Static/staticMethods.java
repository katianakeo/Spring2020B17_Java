package day35_Static;

public class staticMethods {
    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        staticMethods obj = new staticMethods();
        System.out.println(obj.a); // instance can only be called like this
        System.out.println(b); // static can be called on its own

    }
}

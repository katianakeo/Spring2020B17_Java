package day35_Static;

public class staticVariables {
    int a2 = 200;

    static int a3 = 300;

    public static void main(String[] args) {
        int a1 = 1000;
        staticVariables obj1 = new staticVariables();
        obj1.a2 = 100;

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000;

        System.out.println(obj1.a2);
        System.out.println(obj2.a2);


    }
}

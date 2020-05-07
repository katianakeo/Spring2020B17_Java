package day35_Static;

public class StaticVariables2 {
    int instance;
    static int staticvariable;

    public static void main(String[] args) {
        StaticVariables2 obj1 = new StaticVariables2();
        obj1.instance = 300;
        obj1.staticvariable = 400;
        System.out.println(obj1.instance);
        System.out.println(obj1.staticvariable);

        StaticVariables2 obj2 = new StaticVariables2();
        System.out.println(obj2.instance);
        System.out.println(obj2.staticvariable);

        System.out.println(StaticVariables2.staticvariable); // static can be called through class name
       // System.out.println(StaticVariables2.instance); // instance CANNOT be called through class name



    }
}

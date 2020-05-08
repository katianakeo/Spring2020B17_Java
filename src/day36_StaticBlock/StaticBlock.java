package day36_StaticBlock;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }

    static{
        System.out.println("static method");
    }



    public static void method1(){
        System.out.println("custom method");
    }
}

package day36_StaticBlock;

public class StaticBlock3 {
    static String name;
    static int num;

    static {
        name = "Muhtar";
        num = 100;
    }

    public static void main(String[] args) {
        name="Muhtar";
        num=200;
    }
}

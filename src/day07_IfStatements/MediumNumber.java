package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 2000;
        double c = 300;
        // a: if a < b && a > c or a > b && a < c
        // b: if b < c && b > a or b > c && b < a
        // c: if c < b && c > a or c > b && c < a
        boolean aMedium = (a < b && a > c) || (a > b && a < c);
        boolean bMedium = (b < c && b > a) || (b > c && b < a);
        boolean cmedium = (c < b && c > a) || (c > b && c < a);

        if(aMedium){
            System.out.println(a+" is the medium number");
        }
        if(bMedium){
            System.out.println(b+" is the medium number");
        }
        if(cmedium){
            System.out.println(c+" is the medium number");
        }
    }

}

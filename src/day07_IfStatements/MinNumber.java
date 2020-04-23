package day07_IfStatements;
/* 3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal) */
public class MinNumber {
    public static void main(String[] args) {
        double a = 200;
        double b = 200;
        double c = 400.5;
        boolean aMin = a< b && a<c;
        boolean bMin= b<a && c < a;
        boolean cMin = c<b && c < a;

}
}





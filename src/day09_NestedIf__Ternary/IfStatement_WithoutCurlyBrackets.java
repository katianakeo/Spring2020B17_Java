package day09_NestedIf__Ternary;

public class IfStatement_WithoutCurlyBrackets {
    public static void main(String[] args) {
        int number = 100;
        if(number%2==0)
            System.out.println("Even number");

        else
            System.out.println("Odd number");


        if(true){ // if there is more than one statement, we MUST give the brackets
            System.out.println("Hello");
            System.out.println("Condition is true");
            System.out.println("Test Executed");
        }
    }
}

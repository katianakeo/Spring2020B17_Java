package day09_NestedIf__Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num%2==0){
            result = "Even";
        }else{
            result ="Odd";
        }

        // CONVERTING TO TERNARY
        // only use ternary if the if statement is only returning the value assigned to the variable
        // ? = If Statement
        // : = else Statement
        // Variable = (condition) ? PrintIfStatement1 : ElsePrintStatement2;

        String result2 = (num%2==0) ? "Even" : "Odd";
        System.out.println(result2);
        System.out.println(result);

        // ------------------------------------------------------------------------------

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        // ternary
        int max2 = (num1>num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max2);

        // ---------------------------------------------------------------------------
        String str = "";
        if(true){
            str = "Hello";
        }else {
            str = "Hola";
        }
       // Ternary
        String str2 = (true) ? "Hello" : "Hola";
        System.out.println(str2);




    }
}

package day24_Methods;



import java.util.Scanner;

public class WarmUps {
    public static void max(int num1, int num2){
        if(num1>num2){
            System.out.println("Max num is "+num1);
        }
        else{
            System.out.println("Max num is "+num2);
        }
    }
                           //            10        20           *
    public static void Calculation(double num1, double num2, char operator){
        switch(operator){
            case '*':
                System.out.println(num1*num2);
                break;

            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        max(a,b);
        Calculation(a,b,'+');
    }

}

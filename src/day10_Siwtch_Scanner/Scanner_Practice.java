package day10_Siwtch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        // Scanner VariableName = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
         byte num1 = input.nextByte();
        System.out.println("Enter your second number");
        byte num2 = input.nextByte();
        System.out.println("The sum of both numbers are "+(num1+num2));


    }
}

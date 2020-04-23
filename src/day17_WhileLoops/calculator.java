package day17_WhileLoops;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i=0; i==0;) {

            System.out.println("Enter first number");
            int num1 = scan.nextInt();
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            System.out.println("Math Operator: ");
            String operator = scan.next(); // +,-,/,*

            if (operator.equals("+")) {
                System.out.println("Add " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtract " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiply " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Divide " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("remainder of " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Do you wanna continue");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) { // if answer is no, it stops the loop
                break;
            }
        }
    }
}

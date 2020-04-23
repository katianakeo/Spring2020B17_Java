package day10_Siwtch_Scanner;

import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {

       // Scanner variableName = new Scanner(System.in);
        // variable same rules as usual variable

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number:");
        byte num1 = input.nextByte();

        System.out.println("You have entered: "+num1);

        // o name number odd or even
        if(num1%2 == 0){
            System.out.println(num1+" is even number");
        }
        else{
            System.out.println(num1+" is odd number");
        }
    }
}

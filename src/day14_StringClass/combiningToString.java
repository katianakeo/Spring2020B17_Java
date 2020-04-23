package day14_StringClass;

import java.util.Scanner;

public class combiningToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = input.next();
        System.out.println("Enter second word");
        String second = input.next();

        System.out.println(first.concat(second)+second.concat(first));

    }
}

package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        // age + Enter
        System.out.println("Your age is "+age);

        input.nextLine();
        // Enter
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();
        System.out.println("Your name is "+fullName);

    }
}

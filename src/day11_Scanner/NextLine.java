package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String FullName = input.nextLine(); // accepts the "Enter". Hitting "Enter" it accepts it as an answer
        System.out.println(FullName);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        System.out.println("You entered "+sentence);

    }
}

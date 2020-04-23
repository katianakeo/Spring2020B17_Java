package day12_JacaRecap;

import java.util.Scanner;

public class Scanner_Nextline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine();
        // erase the enter so it allows us to print on the NextLine()

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        // Enter counts
        System.out.println(name);

    }
}

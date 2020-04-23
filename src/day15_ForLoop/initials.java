package day15_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*write a program that asks user's first and last name, then prints out the initials of the user
        Ex:
        input:
                cybertek
                batch12
        output:your initial is: CB */

        System.out.println("What is your first name");
        String first = input.next();
        System.out.println("What is your last name");
        String last = input.next();
        String initials = first.substring(0,1)+last.substring(0,1);;

        System.out.println(initials.toUpperCase());

        // can use charAt
        System.out.println("What is your first name");
        String first1 = input.next();
        System.out.println("What is your last name");
        String last1 = input.next();
        String initial = ""+ first.charAt(0)+last1.charAt(0);
        // cannot assign number to String. can concat it to empty String
        System.out.println(initial.toUpperCase());




    }
}

package day16_ForLoop;

import java.util.Scanner;

public class palindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.next();  // java
        String reverse = "";
        for(int i = word.length()-1; i>= 0; i--){

            reverse += word.charAt(i);
        }
        System.out.println(reverse);
        // print out character
        // word length - 1 because total length is 4 but index num starts from 0, so really it's 3
        // i-- because it keeps subtracting "i" value till it's 0
        // "" because you need to assign it to String

        boolean palindrome = word.equalsIgnoreCase(reverse);
        System.out.println(palindrome);


    }
}

package day14_StringClass;

import java.util.Scanner;

public class startendwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // both words must have 5 characters
        // last letter of the first word and first letter of last word have to match
        System.out.println("Enter first word");
        String word = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        int length1 = word.length();
        int length2 = word2.length();

        if(length1==5 && length2==5){
            if(word.charAt(length1 - 1) == word2.charAt(0) ){ // what character it gives you with the num
                System.out.println("Fizz");
            }
            else {
                System.out.println("buzz");
            }

        }else{
            System.out.println("needs to be 5 chars");
        }
    }
}

package day14_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = input.next();
        System.out.println("Enter your second word");
        String word2 = input.next();
        System.out.println("Enter your third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean notsame = length1!=length2 && length1!=length3 && length2!=length2;

        if(length1==length2 && length2==length3){
            System.out.println("Same Lengths");
        }
        else if(notsame){
            System.out.println("All different");
        }
        else{
            System.out.println("Not same nor different");
        }
    }
}

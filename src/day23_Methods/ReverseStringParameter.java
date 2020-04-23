package day23_Methods;

import java.util.Scanner;
public class ReverseStringParameter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = scan.nextLine();

        reverseString(str);

    }

    public static void reverseString(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}

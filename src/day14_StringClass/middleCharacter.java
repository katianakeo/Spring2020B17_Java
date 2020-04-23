package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        // banana

        int total = word.length(); // 7
        int middleNum = total/2; // 7/2 = 3
        System.out.println(middleNum);


        String middleChr = "";
        // odd or even
        if(total%2 != 0){
            middleChr += word.charAt(middleNum);
        }
        else{ // even num
            middleChr += word.charAt(middleNum-1)+""+word.charAt(middleNum) ;
        }
        System.out.println(middleChr);

    }
}

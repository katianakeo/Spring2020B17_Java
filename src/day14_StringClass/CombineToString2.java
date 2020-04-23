package day14_StringClass;

import java.util.Scanner;

public class CombineToString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Elephant";
        //            01234567
        String ch1 = str.substring(3,5);
        System.out.println(ch1);
        // ph
        System.out.println("the two middle letters in elephant are "+ch1);

        // put apple and banana, ppleanana
        String one = "apple";
        //            01234
        String two = "banana";
        //            012345
        String one1 = one.substring(1);
        // pple
        String two1 = two.substring(1);
        System.out.println(one1+two1);
        // putting one 1 number will just print the the rest of the word from where the number is





    }
}

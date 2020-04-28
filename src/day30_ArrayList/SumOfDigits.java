package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        //write a program that can return the sum of all digits from a string

        String str = "a1b2c3";
        char[] chars = str.toCharArray();  //char array
        System.out.println(Arrays.toString(chars));

        int sum = 0;
        for(char each :chars){
           /* if(each>=48 && each<=57){  //if each = digit
              sum += Integer.parseInt(each+""); // concat to string
            }
            */
           if(Character.isDigit(each)){
               sum += Integer.parseInt(each+""); // concat to string
           }
        }
        System.out.println(sum);

        boolean a = Character.isAlphabetic('A');

        // assignment, extract digits and letters

    }
}

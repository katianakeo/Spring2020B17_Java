package day22_Arrays_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //scanner, Array, for loop, for each loop, substring

        String[] arr = new String[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextLine();

        }
        System.out.println(Arrays.toString(arr));

        // if word has 5 letters, print out only first 3
        for(String word :arr){
           String str = word.substring(0,3);
            System.out.println(str);

        }
    }




}

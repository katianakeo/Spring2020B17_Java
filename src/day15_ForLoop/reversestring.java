package day15_ForLoop;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String str = "Java";
        int lastIndexnum = str.length()-1;
        String reverse = "" +str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        for(int i = lastIndexnum; i>= 0; i--){
            System.out.print(str.charAt(i));
        }



    }
}

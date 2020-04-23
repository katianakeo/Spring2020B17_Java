package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedForEachPractice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

         int odd = 0;
        for(int[] each1D : numbers){
            for(int each :each1D){
                if(each%2==0){
                    System.out.print(each+" ");
                }
                else{
                    odd++;
                }
            }

        }
        System.out.println();
        System.out.println(odd);
    }
}

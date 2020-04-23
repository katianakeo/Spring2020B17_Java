package day22_Arrays_Loops;

import java.util.Arrays;

public class Nested_Foreach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int each:arr){
            System.out.println(each);
        }

        int[][] arr2D = {{1,2,3}, {4,5,6}};
        for(int[] each1D :arr2D){
           for(int eachelement :each1D){
               System.out.println(eachelement);
           }
        }

        char[][] ch = {{'A', 'B'}, {'C', 'D', 'E'}};
        //                 0             1

        for(char[] each :ch){
            for(char each1 :each){
                System.out.print(each1);
            }
        }
    }
}

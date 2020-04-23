package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H', 'I'}};
                  //           0           1                 2

        // ar2D[0]
        for(int i=0; i< arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }

        // arr2D[1]
        for(int i=0; i<arr2D[1].length; i++){
            System.out.println(arr2D[1][i]);
        }

        //arr2d[2]
        for(int i=0; i<arr2D[2].length; i++){
            System.out.println(arr2D[2][i]);
        }

        //print all sections
        for(int j =0; j<arr2D.length; j++){
            System.out.println(arr2D[j]);
        }

        //nested loop
        for(int j =0; j<arr2D.length; j++){   // j = index number of 1D array  // i = value in arrays
            for(int i=0; i< arr2D[j].length; i++){
                System.out.println(arr2D[j][i]);
            }
        }

    }


}

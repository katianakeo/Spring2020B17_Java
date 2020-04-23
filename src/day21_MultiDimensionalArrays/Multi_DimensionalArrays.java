package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {
        // array is a variable to store multiple data

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        // index num is     0         1
        System.out.println(arr2D.length);
        int[] arr1D = arr2D[1];    // {1,2,3}
        System.out.println(Arrays.toString(arr1D));
        int num1 = arr2D[1][2]; // second bracket is the index num
        System.out.println(num1);

        //{'A', 'B'}

        char[] [] ch2D = {{'A', 'B'}, {'D','E','F'}, {'G', 'H', 'I'}};
                //             0          1                 2
        char c1 = ch2D[1][2];
        System.out.println(c1);

        String[][] str1 = {{"A", "B","C"},{"D","E","F"},{"J", "H", "I"}};
        String s1 = str1[1][2];
        System.out.println(s1);

    }
}

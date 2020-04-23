package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[] [] arr2D = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));


        int[][][] arr3D = { {{1,2,3}, {4,5,6}}, {{7,8,9},{10,11,12}}};
               //                 0                     1
        System.out.println(Arrays.deepToString(arr3D[1]));

        int six = arr3D[0][1][2];
        System.out.println(six);
        // or
        System.out.println(arr3D[1][1][1]);
    }
}

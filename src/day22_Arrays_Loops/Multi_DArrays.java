package day22_Arrays_Loops;


import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] arr2D = {{1,2,3},{4,5,6} };

        System.out.println(Arrays.toString(arr2D[0]));
        // or int[] arr1D = arr2D[0];

        System.out.println(arr2D[0][2]);
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        for(int each :arr2D[0]){
            System.out.println(each);
        }

        for(int i=0; i<arr2D[0].length; i++){
           int arr = arr2D[0][i];
            System.out.println(arr);
        }
    }



}

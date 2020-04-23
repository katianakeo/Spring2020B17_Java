package day23_Methods;

import Practice.Array;

import java.util.Arrays;

public class AscendingReturn {
    public static void main(String[] args) {
        int[] arr1 = {1,10,5,60,74,2,7};
        int[] arr2 = {90,654,87,54,34,12};
        int[] arr3 = {80,60,50,32,45};
        arr1 = descending(arr1);
        arr2 = descending(arr2);
        arr3 = descending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] descending(int[] arr){
        Arrays.sort(arr);
        int[] rev = new int[arr.length];

        int j = arr.length-1;
        for(int i = 0; i<arr.length; i++){
            rev[i] = arr[j];
            j--;
        }
        return rev;
    }

}

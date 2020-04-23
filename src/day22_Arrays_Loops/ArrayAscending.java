package day22_Arrays_Loops;

import java.util.Arrays;

public class ArrayAscending {
    public static void main(String[] args) {
        int[] arr = {6,8,3,5,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


      int[] Revarr = new int[arr.length]; // new size is the length of array
        int j = arr.length-1; // last index
        for(int i =0 ; i<arr.length; i++){
            Revarr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(Revarr));


    }
}

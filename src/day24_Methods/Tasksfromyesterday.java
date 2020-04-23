package day24_Methods;

import java.util.Arrays;

public class Tasksfromyesterday {

    public static void maxnum(int[] array){
        Arrays.sort(array);   // ascending order
        System.out.println(array[array.length-1]); // after sort, the last one will be max
    }
    public static void minnum(int[] array){
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void descending(int[] array){
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = {7,4,3,9,12,45,28};
        maxnum(arr);
        minnum(arr2);
        descending(arr2);
    }


}

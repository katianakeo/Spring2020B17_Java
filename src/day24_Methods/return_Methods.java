package day24_Methods;

import java.util.Arrays;

public class return_Methods {
    public static int maxNum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int minNum(int[] arr){
        Arrays.sort(arr);
        return  arr[0];
    }




    public static void main(String[] args) {
        int[] arr = {9,8,7,34,747,73,2,46};
        int max = maxNum(arr);
        System.out.println(max);
        int min = minNum(arr);
        System.out.println(min);


    }


}

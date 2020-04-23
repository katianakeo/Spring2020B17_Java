package day27_DateTime;

import java.util.Arrays;

public class WarmUpTask {
    // find minimum number from an int array
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9,1};
        int minimum = arr[0];
        for(int each:arr){
            if(each<minimum){
                minimum = each; // if num is smaller than assigned min, it will be replaced
            }
        }
        System.out.println(minimum);

        int[] arr2 = {90,54,3,78,12,45};
        System.out.println(minimum(arr2));

        double[] arr3 = {22.5,77.4,88.9,23.4};
        double min = minimum(arr3);
        System.out.println(min);
    }

    public static int minimum(int[] arr){
        int minimum = arr[0];
        for(int each:arr){
            if(each<minimum){
                minimum = each; // if num is smaller than assigned min, it will be replaced
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr){
        double minimum = arr[0];
        for(double each:arr){
            if(each<minimum){
                minimum = each; // if num is smaller than assigned min, it will be replaced
            }
        }
        return minimum;
    }


}

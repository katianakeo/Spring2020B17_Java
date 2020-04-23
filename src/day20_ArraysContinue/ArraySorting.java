package day20_ArraysContinue;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {7,10,5,3,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("First min num is "+arr[0]);
        System.out.println("Second min num is "+arr[1]);
        System.out.println("Maximum num is "+arr[arr.length-1]);

        char[] ch = {'a','z', 'd', 'f'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println();

        //descending order
        int[] arr1 = {3,4,1,-1,-6,-80,100};
        int[] arrDesc = new int[arr1.length];  //{0,0,0,0,0,0}
        Arrays.sort(arr1);

        int k = 0;

        for(int i=arr1.length-1; i>=0; i--){
           // System.out.println(arr[i]+" ");
            arrDesc[k] = arr1[i];
            k++;
        }
        System.out.println(Arrays.toString(arrDesc));
    }
}

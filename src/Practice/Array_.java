package Practice;

import java.util.Arrays;

public class Array_ {
    public static void main(String[] args) {
       int[] intarr = {15,30,45,60,75};
       intarr[2] = intarr[4];
       intarr[4] = 90;
        System.out.println(Arrays.toString(intarr));
    }
}

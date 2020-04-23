package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00"); // decimal place, give as string
                // rounds decimal
       double a = 10.0/3.0;
        System.out.println(a);
        System.out.println(DF.format(a));

        double b = 2.89357249;
        System.out.println(DF.format(b));


        // using for average number
        double[] arr = {10,40,90,30.80};
        int length = arr.length;

        double sum = 0;
        for(int i =0; i<=length-1;i++){
            sum += arr[i];
        }
        System.out.println(sum/length);
        System.out.println(DF.format(sum/length));

    }
}

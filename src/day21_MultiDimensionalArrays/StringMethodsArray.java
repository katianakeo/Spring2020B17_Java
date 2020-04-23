package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethodsArray {
    public static void main(String[] args) {
        String name = "Java";
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));

        String str = "I like Java";
       String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String sentence = "Today is great day";
       String[] array = sentence.split(" ");
        System.out.println(Arrays.toString(array));

        // day great is today
         String result = "";
        for(int i = array.length-1; i>=0; i-- ){
            String each = array[i];
            result += each+" ";
        }
        System.out.println(result);


        String str2 = "ABCD";
        String[] arr1 = str2.split("");
        System.out.println(Arrays.toString(arr1));


    }
}

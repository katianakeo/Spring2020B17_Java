package day21_MultiDimensionalArrays;

import javax.print.event.PrintEvent;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        for(DataType variableName: ArrayName){

                 }
         */

        int[] nums = {1,2,3,4};
        for(int eachNum : nums){
            System.out.println(eachNum);
        }

        String[] students = {"Katiana", "Muhtar", "Asiya"};
        for(String names : students){
            System.out.println(names);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        for(int each : arr1){
            if(each > 5){
                continue;
            }
            System.out.println(each);
        }


        String sentence = "i like java";
        String[] words = sentence.split(" ");

        for(int i=words.length-1; i>=0; i--){

            System.out.println(words[i]);
        }



    }
}

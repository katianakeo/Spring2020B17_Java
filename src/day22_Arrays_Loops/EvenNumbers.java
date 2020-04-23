package day22_Arrays_Loops;

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        //numbers[0] = 1;
        // numbers[1] = 2;

        for(int i = 0; i<numbers.length;i++ ){
              numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        for(int even: numbers){
            if(even%2!=0){
                continue;
            }
            System.out.print(even+" ");
        }

    }
}

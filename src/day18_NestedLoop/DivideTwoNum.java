package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 0;
        if(num2==0){
            System.out.println("cannot be zero");
            System.exit(0);

        }
        while(num1>=num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count);
        System.out.println(num1);
    }

}

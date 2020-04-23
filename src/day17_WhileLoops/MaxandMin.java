package day17_WhileLoops;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxnum = -99999999; // any # user provided will be greater
        // first number will be assigned to maxnum

        int minnum = 99999999;

        String result = "";
        for(int i = 0; i<11; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();   // 0,1,2,3,4,5

            if(num>maxnum){
                maxnum = num;
            }

            if(num<minnum){
                minnum = num;
            }

        }
        System.out.println("The minimum number is "+minnum);
        System.out.println("The maximum number is "+maxnum);

    }
}

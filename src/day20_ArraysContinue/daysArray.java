package day20_ArraysContinue;

import java.util.Scanner;

public class daysArray {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};
        // length = 7
        // max Index = 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int attempts = 1;

        while(num>7 || num<=0){
            System.out.println("Invalid Entry");
            System.out.println("Re-Enter");
            num = input.nextInt();
            attempts++;
            if(attempts==3 && (num>7 || num<=0)){
                System.out.println("No more attempts left");
                System.exit(0);
            }
        }

        String result = days[num-1];
        System.out.println(result);
    }
}

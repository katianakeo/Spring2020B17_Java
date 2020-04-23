package day20_ArraysContinue;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[] months = {"January", "Feb", "March", "April", "May", "June", "July", "August", "September"
        , "Oct", "Nov", "Dec"};

        /*String[] months = new String[12];
        months[0] = "Jan"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts = 1;

        while(num>12 || num<=0){
            System.out.println("Invalid Entry");
            System.out.println("Re-enter the number");
             num = input.nextInt();
             attempts++;

             if(attempts==3 && (num>12 || num<=0)){
                 System.out.println("No more attempts left");
                 System.exit(0);
             }
        }
         // loops until num is valid

        String result = months[num-1];
             // num - 1, length is always 1 above so - 1 will give you the right month
        System.out.println(result);

    }
}

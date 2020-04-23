package Practice;

import java.util.Scanner;

public class FindingMaxandMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int max = -217378274;
        int min = 217294739;
        while(i<4){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>max){
                max = num;

            }
            if(num<min){
                min = num;

            }
            i++;


        }

        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);



    }
}

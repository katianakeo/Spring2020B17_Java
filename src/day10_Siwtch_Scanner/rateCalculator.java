package day10_Siwtch_Scanner;

import java.util.Scanner;

public class rateCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
              int salary = scan.nextInt();
        System.out.println("How many hours do you work per week");
                byte hours = scan.nextByte();

        System.out.println("How many weeks do you work in a year?");
        byte weeks = scan.nextByte();

        int hourlyrate = (salary/weeks) / hours;
        System.out.println("Your hourly rate is: $"+hourlyrate);
    }
}

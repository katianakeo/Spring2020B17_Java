package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildnum = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter street:");
        String street = scan.nextLine();
        System.out.println("Enter city:");
        String city = scan.next();
        System.out.println("Enter State:");
        String state = scan.next();
        System.out.println("Enter zipcode:");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Full name of person");
        String name = scan.nextLine();

        System.out.println("Ship To:  "+name );
        System.out.println(buildnum+" "+street);
        System.out.println(city+", "+state+" "+zip);

    }
}

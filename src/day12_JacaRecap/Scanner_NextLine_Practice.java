package day12_JacaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 7925 JonesBranch Dr, Mclean VA 22034
        // fullAddress: Build Num, Street, city, state zipcode
        System.out.println("Building Number: ");
        int num = input.nextInt();
      // 7925 + Enter

        input.nextLine();

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println(street);

        System.out.println("City and State: ");
        String cityState = input.nextLine();
        System.out.println(cityState);


        System.out.println("ZipCode: ");
        int zip = input.nextInt();
        System.out.println(zip);

        input.nextLine();
        // takes out the enter left from input.nextInt

        String fullAdress = num+" "+street+", "+cityState+", "+zip;
        System.out.println(fullAdress);

    }
}

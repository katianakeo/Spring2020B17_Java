package day12_JacaRecap;


import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String str = scan.next();
        // next(); only takes one word, the first
        // System.out.println(str);

        // 7925 JonesBranch Dr, Mclean VA 22034
        System.out.println("Enter number of the building");
        String fullAddress = " ";
        short Bnum = scan.nextShort();
        fullAddress += Bnum+" ";
        // fullAddress = fullAddress+Bnum+" "

        System.out.println("Enter the street name");
        String streetname = scan.next();
        fullAddress += streetname+" ";

        System.out.println("Enter road name");
        String roadname = scan.next();
        fullAddress += roadname+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityname = scan.next();
        fullAddress += cityname+" ";

        String state = scan.next();
        fullAddress += state+", ";
        int zipcode = scan.nextInt();
        fullAddress += zipcode+" ";
        System.out.println(fullAddress);



    }



}

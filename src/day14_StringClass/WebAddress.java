package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {
        // write a program that can validate a web address

        String website = "www.cybertek.gov";
        website = website.toLowerCase();

        boolean ValidEnd = website.endsWith(".com") || website.endsWith(".gov") || website.endsWith(".edu");

        if(website.startsWith("www.") && ValidEnd){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

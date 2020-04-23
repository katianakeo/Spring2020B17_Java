package day11_Scanner;

public class browsers {
    public static void main(String[] args) {

        String browserName = "Chrome";

        switch(browserName){
            case "Chrome":
            case "chrome":
                System.out.println("Chrome is opening...");
                break;

            case "Firefox":
            case "firefox":
                System.out.println("Firefox is opening...");
                break;

            case "Safari":
            case "safari":
                System.out.println("Safari is opening...");
                break;

            case "Opera":
            case "opera":
                System.out.println("Opera is opening..");
                break;

            default :
                System.out.println("Invalid Browser name, please give the right browser name");



        }



    }
}

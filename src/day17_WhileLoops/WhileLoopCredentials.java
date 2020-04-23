package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopCredentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user: cybertek
        // password: cybertek123
        System.out.println("Enter Username");
        String user = input.next();
        System.out.println("Enter Password");
        String password = input.next();

        boolean valid = user.equals("cybertek") && password.equals("cybertek123");
        int count = 1;
        while(!valid){
            System.out.println("please re-enter");
            System.out.println("Enter Username");
            user = input.next();

            System.out.println("Enter Password");
            password = input.next();


            count++;
            if(count==3 && !valid){
                System.out.println("Your account is locked");
                break;
            }
            valid = (user.equals("cybertek") && password.equals("cybertek123"));

            if(valid){
                System.out.println("Logged in successfully");
                break;
            }


        }





    }
}

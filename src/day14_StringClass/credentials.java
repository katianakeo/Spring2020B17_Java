package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        /*
        userName: Cybertek
        passWord: CybetekSchool
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String user = input.next();
        System.out.println("Enter password");
        String password = input.next();

        String ValidUser = "Cybertek";
        String ValidPass = "CybertekSchool";

        boolean validlogin = user.equals(ValidUser) && password.equals(ValidPass);

        if(validlogin){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid");
        }


    }
}

package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        /*
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalid ==> invalid username and password
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name");
        String user = input.next();
        System.out.println("Enter password");
        String pass = input.next();

        boolean login = (user.equals("cybertek") && pass.equals("cybertekschool")) ;
        boolean username = ! user.equals("cybertek") && pass.equals("cybertekschool"); // not equal to
        boolean password = user.equals("cybertek") && !pass.equals("cybertekschool");

        if(!user.isEmpty() && !pass.isEmpty()){ // username and password cannot be empty
            if(login){
                System.out.println("Logged in");
            }
            else if(username){
                System.out.println("Username incorrect");
            }
            else if(password){
                System.out.println("Password incorrect");
            }
            else{
                System.out.println("Invalid username and password");
            }

        }else{ // are empty
            System.out.println("please enter credentials");
        }

    }
}

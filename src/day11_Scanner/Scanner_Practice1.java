package day11_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String last = input.next();
        System.out.print("Full name: "+first+" "+last);


        boolean employed = input.nextBoolean();
        System.out.println("Employee status: "+employed);

        int salary = 0;
        if(employed==true){
            System.out.println("Enter salary: ");
            salary = input.nextInt();
        }
        System.out.println("salary: "+salary);

    }




}

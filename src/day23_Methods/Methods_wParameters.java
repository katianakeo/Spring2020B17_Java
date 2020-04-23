package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Methods_wParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        eligiblebuyalcohol(age);
    }

    public static void eligiblebuyalcohol(int age){
        if(age>=21){
            System.out.println("Can buy alcohol");
        }
        else{
            System.out.println("not eligible");
        }
    }

}

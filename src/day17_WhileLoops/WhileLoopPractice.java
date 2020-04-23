package day17_WhileLoops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String answer = input.next();

        boolean valid = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");

        if(!valid){ // if answer is not yes or no, it keeps asking you to re-enter
            System.out.println("please re-enter");
            answer = input.next();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Entered yes");
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Entered no");
        }



    }


}

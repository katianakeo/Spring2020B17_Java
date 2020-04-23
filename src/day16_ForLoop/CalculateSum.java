package day16_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(); // 100
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        System.out.println(sum);



    }

}

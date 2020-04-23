package day17_WhileLoops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // print even num 0-10
        int num = 0;
        while(num<=10){
            if(num%2==0){
                System.out.println(num);
            }

            num++;
        }

        // add all the even sums together
        int sum = 0;
        int i = 0;
        while(i<=10){
            if(i%2==0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);



    }

}

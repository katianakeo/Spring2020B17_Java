package day12_JacaRecap;

import java.util.Scanner;

public class Ternaries_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter status code:");
        int code = input.nextInt();
        String result = " ";
        if(code==200){
            result = "OK";
        }
        else if(code==201){
            result = "Created";
        }
        else if(code==202){
            result = "Accepted";
        }
        else{
            result = "Invalid";
        }
        System.out.println(result);

        result = (code==201) ? "Created" : (code ==202) ? "Accepted" : "Invalid" ;
        System.out.println(result);
    }
}

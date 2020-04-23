package day13_StringClass;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0-9");
        int num = scan.nextInt();

        String word = " ";
        switch(num){
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "Invalid";

        }
        System.out.println(word);


        // Ternary
        String word2 = "";
        word2 = num==0 ? "Zero" : num==1 ? "One" : num==2 ? "Two" : num==3 ? "Three" : num==4 ? "Four" : num==5 ?
                "Five" : num==6 ? "Six" : num==7 ? "Seven" : num==8 ? "Eight" : num==9 ? "Nine" : "Invalid";

        System.out.println(word2);



    }
}

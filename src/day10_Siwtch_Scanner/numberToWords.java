package day10_Siwtch_Scanner;

public class numberToWords {
    public static void main(String[] args) {
        // 0-9 to words
        // num > 9 = invalid
        // do not use if statement
        // use ternary

        int num = 10;
        String result = " ";
        result = (num==0) ? " Zero" : (num==1)? "One" : (num==2) ? "Two" : (num==3) ? "Three" : (num==4)
                ? "Four" : (num==5) ? "Five" : (num==6) ? "Six" : (num==7) ? "Seven" :
                (num==8)? "Eight" : (num==9) ? "Nine" : "Invalid" ;
        System.out.println(result);



    }
}

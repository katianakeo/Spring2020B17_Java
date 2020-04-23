package day17_WhileLoops;

import java.util.Scanner;

public class FINDRA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i<=30; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FINRA");
            }
            else if(i%3==0){
                System.out.println("FIN");
            }
            else if(i%5==0){
                System.out.println("RA");
            }
            else{
                System.out.println(i);
            }
        }
    }
}

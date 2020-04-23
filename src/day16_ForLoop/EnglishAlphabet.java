package day16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        // alphabet is ascending order
        // alphabet is descending order

       for(char ch = 'A'; ch <='Z'; ch++){ // a-z
           System.out.print(ch+" ");

       }
        System.out.println();
       for(char ch = 'Z'; ch >= 'A'; ch--){ // z-a
           System.out.print(ch+" ");
       }

        System.out.println();
       for(char ch = 'a'; ch<= 'z'; ch++){
           System.out.print(ch+" ");
       }

    }




}

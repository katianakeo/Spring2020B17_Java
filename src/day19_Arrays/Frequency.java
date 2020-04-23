package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        // write a program to return the frequency of characters in string
        // AABBCCC = A2B2C3

        String str = "AABCC"; // A2B1C2
        String result = "";  // A2B1C2

        String nonDuplicates = "";  // ABC

        for(int i =0; i<=str.length()-1; i++){
            if(!nonDuplicates.contains(""+str.charAt(i))){
                nonDuplicates += str.charAt(i);
            }
        }
        System.out.println(nonDuplicates); // ABC


        int count = 0;

    }
}

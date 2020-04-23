package day19_Arrays;

public class uniques {
    public static void main(String[] args) {

        /*
        write a program that can return the unique characters from a string

         */
        String str = "AABCCHHIT";
        String result = "";  // store unique character

        for(int j = 0; j<= str.length()-1; j++){
            int count = 0;
            for(int i=0; i<=str.length()-1; i++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){  // if unique
                result += str.charAt(j);
            }
        }
        System.out.println(result);
    }
}

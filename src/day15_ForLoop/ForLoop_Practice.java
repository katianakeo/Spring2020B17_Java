package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 1-100 in a single lime separated by a space
         */
        String result = "";
        for(int i=1; i<=100; i+=2){
            // System.out.print(i);
            result += i+" ";  // result = result + i
        }
        System.out.println(result);

        String resultEven = " ";
        for(int even=0; even<=100; even+=2 ){
            System.out.print(even+" ");
        }

    }
}

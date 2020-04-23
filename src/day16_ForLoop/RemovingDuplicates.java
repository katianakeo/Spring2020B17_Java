package day16_ForLoop;

public class RemovingDuplicates {
    public static void main(String[] args) {
        String str = "CDCD";
        //            0123
        String result = ""; //a

        for(int i=0; i<= str.length()-1; i++){
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}

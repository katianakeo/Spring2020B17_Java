package day21_MultiDimensionalArrays;

public class emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com"};
        for(String Eachemail: emails){
            if(Eachemail.endsWith("@gmail.com")){
               continue;
            }
            System.out.println(Eachemail);
        }
    }
}

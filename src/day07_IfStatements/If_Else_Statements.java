package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = 0;
        if(number>= 0){
            System.out.println(number+" is positive");
        }
        if(number<0){
            System.out.println(number+" is negative");
        }
        if(number>=0) {
            System.out.println(number + " is positive");
        } else{
            System.out.println(number+" is negative");
        }
        int digit = 97;
        if(digit%2==0){
            System.out.println(digit+" is positive");
        }else{
            System.out.println(digit+" is negative");
        }
     // or can use boolean
        int num2 = 97;
        boolean evennum = num2%2==0;
        boolean evennum2 = num2!=0;
        if(evennum || evennum2){
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
        }
        if(evennum){
            System.out.println(num2+" is positive");
        }else{
            System.out.println(num2+" is negative");
        }

        int age = 30;
        if(age>=21){
            System.out.println("Here is your vodka");
        }else{
            System.out.println("No alcohol");
        }
    }
}

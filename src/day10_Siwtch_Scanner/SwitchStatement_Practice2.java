package day10_Siwtch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {
        int num = 1;

        switch(1){
            case 1:
                num+=3;
                break;

            case 2:
                num += 2;
                break;
            case 3:
                num+=10;
               break;
            default :
                num -= 5;
        }
        System.out.println(num);
         // if there's not a break after the equation, the next equation will apply to the number
    }
}

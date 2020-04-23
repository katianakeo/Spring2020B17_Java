package day10_Siwtch_Scanner;

public class daysinMonth {
    public static void main(String[] args) {
        int month = 6;
        String result = " ";
        boolean days28 = month == 2;
        boolean days30 = (month==4) || (month==6) || (month==9) || (month==11);
        boolean days31 = month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month==10
                || month == 12;

        if(month> 0 && month<13){
            result = (days28) ? "Month has 28 days" : (days30) ? "Month has 30 days" : "Month has 31 days" ;
        }
        else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}

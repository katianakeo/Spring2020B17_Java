package day09_NestedIf__Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 100;
        char ch1 = ' ';
         // two if statements and 1 else statement
        char ch2 = (number>0) ? '+' : (number<0) ? '-' : '0';

        byte score = 60;
        String grade = (score>=90 && score<=100) ? "Excellent" : (score>=80 && score < 90) ? "Great" :
                (score>= 70 && score< 80) ? "Good" : (score>= 60 && score<70) ? "Pass" : (score<60 && score>0)? "Failed"
                : "Invalid";
        System.out.println(grade);

    }
}

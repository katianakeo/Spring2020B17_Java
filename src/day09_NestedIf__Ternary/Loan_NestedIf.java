package day09_NestedIf__Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary = 120000;
        byte workHistory = 3;
        if(salary>=3000){
            if(workHistory>=2){
                System.out.println("You are qualified for a loan");
            }
            else{
                System.out.println("You must have had a job for at least 2 years");
            }
        }
        else{
            System.out.println("You must earn at least 3000");
        }
    }
}

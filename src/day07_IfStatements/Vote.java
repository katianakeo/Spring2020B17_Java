package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {
        int age = 18;
        boolean citizen = true;
        boolean likeDonald = true;
        boolean eligible = age>=18 && citizen && likeDonald;
        if(eligible){
            System.out.println("You are eligible to vote");

        }
        if(!eligible){
            System.out.println("You are not eligible to vote");
        }
    }
}

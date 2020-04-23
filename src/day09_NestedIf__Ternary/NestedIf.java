package day09_NestedIf__Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean USCitizen = true;
        int age = 17;

        if(USCitizen){ //if not a us citizen, can't vote. Connects to bottom "else"
            // if they are, then have to check the age if they can vote
            if(age>17){
                System.out.println("You can vote");
            }else{
                System.out.println("Wait to vote");
            }
        }else {
            System.out.println("Only the US citizens are eligible to vote");
        }
        //--------------------------------------------------

        int score = 40;
        String grade = " ";
        if(score>=0 && score<=100){
            if(score>=90){
                grade = "A";
            }
            else if(score>= 80){
                grade = "B";
            }
            else if(score>=70){
                grade = "C";
            }
            else if(score>=60){
                grade = "D";
            }
            else {
                grade = "F";
            }
        }else{
            grade = "Failed";
        }
        System.out.println(grade);

        //-----------------------------------------------------
        int score2 = 75;
        String grade2 = "";

        if(score2>=0 && score<=100){
            grade2 = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
        }
        else{
            grade2 = "Invalid";
        }





    }
}

package day09_NestedIf__Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        // Practice
        // Ternary can only apply to IF Statements if they have a variable = value
        // ? = If
        // : = else

        String result = "";
        if(9>10){
            result = "9 is greater";
        }else{
            result = "10 is greater";
        }

        String result2 = (9>10) ? "9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);


        // -----------------------------------------
        String hello = "";
        String hello1 = (10>11) ? "10 is greater" : "11 is greater";
        System.out.println(hello1);

        //------------------------------------------------------
        int age = 20;
        boolean eligibility ;
        if(age>=21){
            eligibility = true;
        }else{
            eligibility = false;
        }
        System.out.println(eligibility);
        // --------------------------------------------------
        int ageOfPerson = 20;
        String eligibleToVote = "";
        if(ageOfPerson >= 18){
            eligibleToVote = "Yes";
        }else{
            eligibleToVote = "No";
        }
        System.out.println(eligibleToVote);


        String eligibleToVote2 = (ageOfPerson>=18) ? "Yes" : "No";



    }
}

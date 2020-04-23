package day09_NestedIf__Ternary;

public class ageGroups_NestedIf {
    public static void main(String[] args) {
         /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
         int age = 66;
         String ageGroup = " ";
         if(age<150 && age>=0){
             if(age<21){
                 ageGroup = "Teenager";
             }
             else if(age>=21 && age<55){
                 ageGroup = "Adult";
             }
             else{
                 ageGroup = "Senior";
             }
         }
         else{
             ageGroup = "Invalid Entry";
         }
        System.out.println(ageGroup);
    }

}

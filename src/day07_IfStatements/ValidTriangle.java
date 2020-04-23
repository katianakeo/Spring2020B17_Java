package day07_IfStatements;
/*
Warmup task:
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.



	5. write a java program that can identify if a person is eligible to vote for Donald Trump
*/
public class ValidTriangle {
    public static void main(String[] args) {
        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 100;
        // triangle = 180
        int sumOfAngles = (int)(angle1+angle2+angle3);


        if(sumOfAngles==180){
        System.out.println("The shape is a triangle");}

        if(sumOfAngles!=180) {
            System.out.println("The shape is not a valid triangle");
        }


    }

}

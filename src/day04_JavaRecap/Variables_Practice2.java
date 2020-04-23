package day04_JavaRecap;

public class Variables_Practice2 {
    public static void main(String[] args) {
        /*
        task: write a program to find the area and perimeter of the circle
        radius = ?
        Pi = 3.14
        Area = r*r*3.14
        P = 2*3.14*r
        */

        double radius = 2.5;
        double Pi = 3.14;

        double area = radius*radius*Pi;
        System.out.println("The area of the circle has a radius of "+radius+" is: "+area);

        double perimeter = 2*3.14*radius;
        System.out.println("Perimeter of the circle is: "+perimeter);

        double circle1R = 3;
        double circle2R = 5;

        boolean circle1 = circle1R > circle2R;
        boolean circle2 = circle2R > circle1R;
        System.out.println(circle1);
        System.out.println(circle2);







    }




}

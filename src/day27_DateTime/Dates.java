package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate bday = LocalDate.of(2000, 4, 29);
        System.out.println(bday);

        //after
        boolean result1 = date1.isAfter(bday);
        System.out.println(result1);
        //before
        boolean result2 = date1.isBefore(bday);
        System.out.println(result2);
        //equal
        boolean result3 = date1.isEqual(bday);
        System.out.println(result3);

        LocalDate now = LocalDate.now();
        System.out.println("Today is "+now);

        String str = now.toString(); // convert to string
        System.out.println(str.replace("-", "/"));



    }
}

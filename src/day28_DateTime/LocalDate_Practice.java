package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {
        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate johnbirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBday = LocalDate.of(2000, 10, 12);
        LocalDate danielBday = LocalDate.of(2010, 5, 6);

        LocalDate[] birthdays = {johnbirthday, AaronBday, danielBday};

        for(int i=0; i<friends.length; i++){
            String name = friends[i];
            LocalDate bday = birthdays[i];
            System.out.println(name+" birthday is "+bday);
        }

    }

}

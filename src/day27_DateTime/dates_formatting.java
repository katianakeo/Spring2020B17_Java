package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dates_formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd,MMM,yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM,dd, yyyy");
        System.out.println(date1.format(dtf1));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMMM, dd, yyyy");
        System.out.println(date1.format(dtf2));
    }
}

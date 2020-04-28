package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // 2020-03-20 11:25:30

        LocalDate date = LocalDate.of(2020, 3, 20);
        LocalTime time = LocalTime.of(11,25,30);
        LocalDateTime datetime = LocalDateTime.of(date, time);
        System.out.println(datetime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.of(2000, 4,29);
        System.out.println(date2.format(dtf));
    }
}

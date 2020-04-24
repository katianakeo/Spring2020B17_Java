package day28_DateTime;

import java.time.LocalTime;

public class LocalTime_Practice {
    public static void main(String[] args) {
        java.time.LocalTime now = java.time.LocalTime.now();
        System.out.println(now);

        java.time.LocalTime time1 = java.time.LocalTime.of(15,30, 45);

    }
}

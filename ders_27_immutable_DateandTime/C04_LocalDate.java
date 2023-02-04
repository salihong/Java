package ders_27_immutable_DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        LocalTime zaman= LocalTime.now();
        LocalDateTime tarihZaman=LocalDateTime.now();
        System.out.println(tarih.plusMonths(5));
        System.out.println(zaman);
        System.out.println(tarihZaman);

        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));


                System.out.println(tarih.withYear(2003).withDayOfMonth(8).getDayOfWeek());



    }
}

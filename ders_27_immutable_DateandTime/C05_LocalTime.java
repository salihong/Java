package ders_27_immutable_DateandTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        LocalTime saat2=LocalTime.of(02,05,01);

       // System.out.println(saat);

        System.out.println(saat.compareTo(saat2));

    }
}
